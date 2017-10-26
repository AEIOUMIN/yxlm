<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<div id="header-topbar-option-demo" class="page-header-topbar">
			<nav id="topbar" role="navigation" style="margin-bottom: 0;"
				data-step="3" class="navbar navbar-default navbar-static-top">
				<div class="navbar-header">
					<button type="button" data-toggle="collapse"
						data-target=".sidebar-collapse" class="navbar-toggle">
						<span class="sr-only">侧边栏显示于隐藏</span><span class="icon-bar"></span><span
							class="icon-bar"></span><span class="icon-bar"></span>
					</button>
					<a id="logo" href="#" class="navbar-brand"><span
						class="fa fa-rocket"></span><span class="logo-text">英雄联盟</span><span
						style="display: none" class="logo-text-icon">µ</span></a>
				</div>
				<div class="topbar-main">
					<a id="menu-toggle" href="#" class="hidden-xs"><i
						class="fa fa-bars"></i></a>

					<form id="topbar-search" action="" method=""
						class="hidden-sm hidden-xs">
						<div class="input-icon right text-white">
							<a href="#"><i class="fa fa-search"></i></a><input type="text"
								placeholder="搜索框" class="form-control text-white" />
						</div>
					</form>
					<div class="news-update-box hidden-xs">
						<span class="text-uppercase mrm pull-left text-white">联盟快报</span>
						<ul id="news-update" class="ticker list-unstyled">
							<li>2017全球总决赛</li>
							<li>火热开赛中!!!!</li>
						</ul>
					</div>
					<ul class="nav navbar navbar-top-links navbar-right mbn">
						<li class="dropdown"><a data-hover="dropdown" href="#"
							class="dropdown-toggle"><i class="fa fa-bell fa-fw"></i><span
								class="badge badge-green">3</span></a></li>
						<li class="dropdown"><a data-hover="dropdown" href="#"
							class="dropdown-toggle"><i class="fa fa-envelope fa-fw"></i><span
								class="badge badge-orange">7</span></a></li>
						<li class="dropdown"><a data-hover="dropdown" href="#"
							class="dropdown-toggle"><i class="fa fa-tasks fa-fw"></i><span
								class="badge badge-yellow">8</span></a></li>
						<li class="dropdown topbar-user"><a data-hover="dropdown"
							href="#" class="dropdown-toggle"><img
								src="${pageContext.request.contextPath}/assets/img/1001.png"
								alt="" class="img-responsive img-circle" />&nbsp;<span
								class="hidden-xs">张三</span>&nbsp;<span class="caret"></span></a>
							<ul class="dropdown-menu dropdown-user pull-right">
								<li><a href="#"><i class="fa fa-user"></i>召唤师的工作</a></li>
								<li><a href="#"><i class="fa fa-calendar"></i>召唤师的时间</a></li>
								<li><a href="#"><i class="fa fa-envelope"></i>email<span
										class="badge badge-danger">3</span></a></li>
								<li><a href="#"><i class="fa fa-tasks"></i>My Tasks<span
										class="badge badge-success">7</span></a></li>
								<li class="divider"></li>
								<li><a href="#"><i class="fa fa-lock"></i>锁定屏幕</a></li>
								<li><a href="${pageContext.request.contextPath}/index"><i
										class="fa fa-key"></i>退出</a></li>
							</ul></li>
						<li id="topbar-chat" class="hidden-xs"><a
							href="javascript:void(0)" data-step="4"
							data-intro="&lt;b&gt;Form chat&lt;/b&gt; keep you connecting with other coworker"
							data-position="left" class="btn-chat"><i
								class="fa fa-comments"></i><span class="badge badge-info">3</span></a></li>
					</ul>
				</div>
			</nav>
			<!--BEGIN MODAL CONFIG PORTLET-->
			<div id="modal-config" class="modal fade">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" data-dismiss="modal" aria-hidden="true"
								class="close">&times;</button>
							<h4 class="modal-title">标题</h4>
						</div>
						<div class="modal-body">
							<p>
								在瓦罗然大陆，虽然人们对德玛西亚的军纪存在争议，但是相同点是所有人都尊敬它。平民和士兵都严格遵守着“零容忍”的准则。这意味着在战斗中徳玛西亚军队永远不会找借口托辞、逃跑、或者投降。至高的军队领袖们强力地执行着这些原则。
								盖伦——拥有“德玛西亚之力”头衔的英勇勇士，就是军队的模范。成千上万的英雄在德玛西亚和诺克萨斯（德玛西亚的敌对阵营）战场上浴血奋战，战死沙场。在军旗下，盖伦遇到了他旗鼓相当的对手——不祥之刃卡特琳娜。那些参与战争且幸存下来的士兵们认为，盖伦和卡特琳娜的对战不像是在打斗，而像跳舞。
								盖伦是德玛西亚军队的骄傲，是无畏先锋军团的领袖。生平第一次气喘吁吁地从战场归来，尽管有人认为他并非因为实力悬殊才失掉战斗。那时候流言甚嚣尘上。此后，盖伦会抓住每次和卡特琳娜切磋的机会来证明自己。作为德玛西亚的道德模范，盖伦从不理会这些传言，因为他知道别人是无法理解他的。对于真正的勇士而言，寻找一个旗鼓相当的对手是他的动力。如此美丽、与众不同的对手证明了他存在的价值。
								盖伦的前线战略——“杀敌的最好方法就是连他身边的人一起砍翻。”</p>
						</div>
						<div class="modal-footer">
							<button type="button" data-dismiss="modal"
								class="btn btn-default">关闭</button>
							<button type="button" class="btn btn-primary">保存改变</button>
						</div>
					</div>
				</div>
			</div>
			<!--END MODAL CONFIG PORTLET-->
		</div>