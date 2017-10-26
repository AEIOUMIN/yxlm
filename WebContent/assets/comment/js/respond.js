window.onload = function()
{
	if (/MSIE 6/.test(navigator.userAgent) || /MSIE 7/.test(navigator.userAgent))
	{
		var newNode = document.createElement("div");
			newNode.setAttribute('id', 'browser-not-support');
	        newNode.innerHTML = '<img class="pull-left" src="'+ G_STATIC_URL +'/css/default/img/404-logo.png" alt="" />'+
					'<div class="pull-left content">'+
						'<h1>鎮ㄧ殑娴忚鍣�<span>涓嶅彈鏀寔</span></h1>'+
						'<p>鎮ㄧ殑娴忚鍣ㄧ増鏈潪甯告棫, 瀛樺湪璇稿瀹夊叏鍜屼綋楠岄棶棰�! 寤鸿<a href="http://windows.microsoft.com/zh-cn/windows/upgrade-your-browser">鏇存柊</a>鎴栬€呬娇鐢ㄥ叾浠栨祻瑙堝櫒鏉ヨ闂�, 濡傛灉鎮ㄤ娇鐢ㄧ殑鏄悳鐙椼€�360銆侀仺娓哥瓑鍙屾牳娴忚鍣�, 璇峰垏鎹㈠埌鏋侀€熸ā寮忎互鑾峰緱鏇村ソ鐨勪綋楠�</p>'+
						'<ul>'+
							'<li><a href="http://www.google.cn/intl/zh-CN/chrome/browser/">锟� Google 娴忚鍣�</a></li>'+
							'<li><a href="http://opera.com/">锟� Opera 娴忚鍣�</a></li>'+
							'<li><a href="http://www.mozilla.com/firefox/">锟� Firefox 娴忚鍣�</a></li>'+
						'</ul>'+
					'</div>';
		document.getElementsByTagName('body')[0].appendChild(newNode);
	}
}