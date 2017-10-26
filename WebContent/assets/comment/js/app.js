var document_title = document.title;

$(document).ready(function ()
{
    // fix form bug...
    $("form[action='']").attr('action', window.location.href);

    // 楠岃瘉鐮�
    $('img#captcha').attr('src', G_BASE_URL + '/account/captcha/');
    
    // 杈撳叆妗嗚嚜鍔ㄥ楂�
    $('.autosize').autosize();

    //缂栬緫鍣ㄥ垵濮嬪寲
    if (typeof Markdown != 'undefined' && $('#wmd-input').length)
    {
        var converter1 = new Markdown.Converter();
        
        var editor1 = new Markdown.Editor(converter1, $('.wmd-panel'), $('#wmd-preview'));
        
        editor1.run();

        AWS.Editor.set_editor_preview();

    }

    //鍝嶅簲寮忓鑸潯鏁堟灉
    $('.aw-top-nav .navbar-toggle').click(function()
    {
        if ($(this).parents('.aw-top-nav').find('.navbar-collapse').hasClass('active'))
        {
            $(this).parents('.aw-top-nav').find('.navbar-collapse').removeClass('active');
        }
        else
        {
            $(this).parents('.aw-top-nav').find('.navbar-collapse').addClass('active');
        }
    });

    //妫€娴嬮€氱煡
    if (typeof (G_NOTIFICATION_INTERVAL) != 'undefined')
    {
        AWS.Message.check_notifications();
        AWS.G.notification_timer = setInterval('AWS.Message.check_notifications()', G_NOTIFICATION_INTERVAL);
    }

    //鏂囩珷鍒楄〃鏍峰紡璋冩暣
    $.each($('.aw-common-list .aw-item.article'), function (i, e)
    {
        if ($(this).find('img').length > 1)
        {
            if ($.trim($(this).find('.markitup-box').text()) == '')
            {
                $(this).find('.aw-upload-img-list, .markitup-box img').css({
                    'right': 'auto',
                    'left': 0,
                    'top': 10
                });
            }
            $(this).find('.aw-upload-img-list').next().detach();
            $(this).find('.markitup-box img').eq(0).css({'z-index':'999'});
        }
        else
        {
            $(this).find('.img.pull-right').hide();
        }
    });

    $('a[rel=lightbox]').fancybox(
    {
        openEffect: 'none',
        closeEffect: 'none',
        prevEffect: 'none',
        nextEffect: 'none',
        centerOnScroll : true,
        closeBtn: false,
        helpers:
        {
            buttons:
            {
                position: 'bottom'
            }
        },
        afterLoad: function ()
        {
            this.title = '绗� ' + (this.index + 1) + ' 寮�, 鍏� ' + this.group.length + ' 寮�' + (this.title ? ' - ' + this.title : '');
        }
    });
	
	if (window.location.hash.indexOf('#!') != -1)
	{
		if ($('a[name=' + window.location.hash.replace('#!', '') + ']').length)
		{
			$.scrollTo($('a[name=' + window.location.hash.replace('#!', '') + ']').offset()['top'] - 20, 600, {queue:true});
		}
	}
	
    /*鐢ㄦ埛澶村儚鎻愮ずbox*/
    AWS.show_card_box('.aw-user-name, .aw-user-img', 'user');

    AWS.show_card_box('.topic-tag .text, .aw-topic-name, .aw-topic-img', 'topic');
    
    //鏂囩珷椤垫坊鍔犺瘎璁�, 璇濋娣诲姞 缁戝畾浜嬩欢
    AWS.Init.init_article_comment_box('.aw-article-content .aw-article-comment');

    AWS.Init.init_topic_edit_box('.aw-edit-topic');

    //璇濋缂栬緫涓嬫媺鑿滃崟click浜嬩欢
    $(document).on('click', '.aw-edit-topic-box .aw-dropdown-list li', function ()
    {
        $(this).parents('.aw-edit-topic-box').find('#aw_edit_topic_title').val($(this).text());
        $(this).parents('.aw-edit-topic-box').find('.add').click();
        $(this).parents('.aw-edit-topic-box').find('.aw-dropdown').hide();
    });

    //璇濋鍒犻櫎鎸夐挳
    $(document).on('click', '.topic-tag .close',  function()
    {
        var data_type = $(this).parents('.aw-topic-bar').attr('data-type'),
            data_id = $(this).parents('.aw-topic-bar').attr('data-id');
        switch (data_type)
        {
            case 'question':
                $.post(G_BASE_URL + '/topic/ajax/remove_topic_relation/', 'type=question&item_id=' + data_id + '&topic_id=' + $(this).parents('.topic-tag').attr('data-id'),function(){
                    $('#aw-ajax-box').empty();
                });
                break;

            case 'topic':
                $.get(G_BASE_URL + '/topic/ajax/remove_related_topic/related_id-' + $(this).parents('.topic-tag').attr('data-id') + '__topic_id-' + data_id);
                break;

            case 'favorite':
                $.post(G_BASE_URL + '/favorite/ajax/remove_favorite_tag/', 'item_id=' + data_id + '&item_type=' + data_type + '&tags=' + $.trim($(this).parents('.topic-tag').text()));
                break;

            case 'article':
                $.post(G_BASE_URL + '/topic/ajax/remove_topic_relation/', 'type=article&item_id=' + data_id + '&topic_id=' + $(this).parents('.topic-tag').attr('data-id'),function(){
                    $('#aw-ajax-box').empty();
                });
                break;

        }

        $(this).parents('.topic-tag').remove();

        return false;
    });
	
    //灏忓崱鐗噈ouseover
    $(document).on('mouseover', '#aw-card-tips', function ()
    {
        clearTimeout(AWS.G.card_box_hide_timer);
        
        $(this).show();
    });

    //灏忓崱鐗噈ouseout
    $(document).on('mouseout', '#aw-card-tips', function ()
    {
        $(this).hide();
    });

    //鐢ㄦ埛灏忓崱鐗囧叧娉ㄦ洿鏂扮紦瀛�
    $(document).on('click', '.aw-card-tips-user .follow', function ()
    {
        var uid = $(this).parents('.aw-card-tips').find('.name').attr('data-id');
       
        $.each(AWS.G.cashUserData, function (i, a)
        {
            if (a.match('data-id="' + uid + '"'))
            {
                if (AWS.G.cashUserData.length == 1)
                {
                    AWS.G.cashUserData = [];
                }
                else
                {
                    AWS.G.cashUserData[i] = '';
                }
            }
        });
    });

    //璇濋灏忓崱鐗囧叧娉ㄦ洿鏂扮紦瀛�
    $(document).on('click', '.aw-card-tips-topic .follow', function ()
    {
        var topic_id = $(this).parents('.aw-card-tips').find('.name').attr('data-id');
        
        $.each(AWS.G.cashTopicData, function (i, a)
        {
            if (a.match('data-id="' + topic_id + '"'))
            {
                if (AWS.G.cashTopicData.length == 1)
                {
                    AWS.G.cashTopicData = [];
                }
                else
                {
                    AWS.G.cashTopicData[i] = '';
                }
            }
        });
    });
    
    /*icon tooltips鎻愮ず*/
    $(document).on('mouseover', '.follow, .voter, .aw-icon-thank-tips, .invite-list-user', function ()
    {
        $(this).tooltip('show');
    });

    //鎼滅储涓嬫媺
    AWS.Dropdown.bind_dropdown_list('#aw-search-query', 'search');

    //缂栬緫鍣ˊ浜�
    AWS.at_user_lists('#wmd-input, .aw-article-replay-box #comment_editor', 5);
	
    //ie娴忚鍣ㄤ笅input,textarea鍏煎
    if (document.all)
    {
        AWS.check_placeholder($('input, textarea'));

        // 姣忛殧1s杞妫€娴媝laceholder
        setInterval(function()
        {
            AWS.check_placeholder($('input[data-placeholder!="true"], textarea[data-placeholder!="true"]'));
        }, 1000);
    }
});

$(window).on('hashchange', function() {
    if (window.location.hash.indexOf('#!') != -1)
    {
        if ($('a[name=' + window.location.hash.replace('#!', '') + ']').length)
        {
            $.scrollTo($('a[name=' + window.location.hash.replace('#!', '') + ']').offset()['top'] - 20, 600, {queue:true});
        }
    }
});

$(window).scroll(function ()
{
    if ($('.aw-back-top').length)
    {
        if ($(window).scrollTop() > ($(window).height() / 2))
        {
            $('.aw-back-top').fadeIn();
        }
        else
        {
            $('.aw-back-top').fadeOut();
        }
    }
});