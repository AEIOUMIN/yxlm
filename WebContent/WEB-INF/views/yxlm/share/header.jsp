<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header class="theme-bright clearifix">


	<div class="logo pull-left">
		<a href="/" onclick="trackEvent('nav', 'logo')"><img
			src="${pageContext.request.contextPath}/assets/bootstrap/img/logo.ico"
			data-theme-dark="${pageContext.request.contextPath}/assets/bootstrap/img/提莫.png"
			data-theme-bright="${pageContext.request.contextPath}/assets/bootstrap/img/logo.ico" /></a>
	</div>

	<div class="header pull-right">
		<!--main nav begin-->
		<nav>
			<ul>
				<c:forEach items="${topics}" var="topic">
						&nbsp;&nbsp;&nbsp;&nbsp;
						<li class="" style="a: hover{background-color:yellow;"><a
						href="${pageContext.request.contextPath}${topic.url}" >
							<button type="button" class="btn btn-lg  btn-default"
								style="color: black;">
								<strong>${topic.topicName}</strong>
							</button>
					</a></li>
				</c:forEach>

				<li><a href="javascript:;" class="assistant-switch"><img
						src="${pageContext.request.contextPath}/assets/bootstrap/img/超凡大师.png"
						data-icon-open="${pageContext.request.contextPath}/assets/bootstrap/img/璀璨钻石.png"
						data-icon-close="${pageContext.request.contextPath}/assets/bootstrap/img/青铜不屈.png"
						class="img-responsive"> </a></li>
			</ul>
		</nav>
		<!--main nav end-->
		<!--assistant begin-->
		<div class="site-assistant">
			<a href="javascript:;" class="assistant-switch"><img
				src="${pageContext.request.contextPath}/assets/bootstrap/img/超凡大师.png"
				data-icon-open="${pageContext.request.contextPath}/assets/bootstrap/img/璀璨钻石.png"
				data-icon-close="${pageContext.request.contextPath}/assets/bootstrap/img/青铜不屈.png"
				class="img-responsive"></a>
			<ul>
				<li><a href="${pageContext.request.contextPath}/yxlm/webmaster/login" class="assistant-banner"> <img
						src="${pageContext.request.contextPath}/assets/bootstrap/img/微博.png"
						class="center-block img-responsive" /> <span>后台管理</span>
				</a>
					<div class="assistant-banner-pop">
						<a href="#"
							onclick="trackEvent('nav', 'side_banner1')"><img
							src="/assets/images/assistant-banner-01.png"
							class="img-responsive" alt="智能双Q系列"></a> <a target="_blank"
							href="#"
							onclick="trackEvent('nav', 'side_banner2')"><img
							src="/assets/images/assistant-banner-02.png"
							class="img-responsive" alt="节水中国行"></a> <a target="_blank"
							href="#"><img
							src="/assets/images/assistant-banner-03.jpg"
							class="img-responsive" alt="梦想改造家"></a>
					</div></li>
				<li><a rel="nofollow" target="_blank"
					onclick="trackEvent('nav', 'side_chat')"
					href="#">
						<img
						src="${pageContext.request.contextPath}/assets/bootstrap/img/在线客服.png"
						class="center-block img-responsive" /> <span>在线客服</span>
				</a></li>
				<li><a href="#"
					onclick="trackEvent('nav', 'side_dealer')"> <img
						src="${pageContext.request.contextPath}/assets/bootstrap/img/野区查询.png"
						class="center-block img-responsive" /> <span>野区查询</span>
				</a></li>
				<li><a href="javascript:;" class="assistant-wechat"> <img
						src="${pageContext.request.contextPath}/assets/bootstrap/img/超级传送.png"
						class="center-block img-responsive" /> <span>关注微信</span>
				</a>
					<div class="assistant-wechat-pop">
						<a href="javascript:;"><img
							src="${pageContext.request.contextPath}/assets/bootstrap/img/召唤师.png"
							class="img-responsive"></a>
					</div></li>
				<li><a rel="nofollow" href="#"
					target="_blank" onclick="trackEvent('nav', 'side_weibo')"> <img
						src="${pageContext.request.contextPath}/assets/bootstrap/img/微博.png"
						class="center-block img-responsive" /> <span>关注微博</span>
				</a></li>
			</ul>
		</div>
		<!--assistant end-->
	</div>

	<!--sub nav begin-->
	<div class="docker-container">
		<div class="docker-content clearfix">
			<div class="docker-container-width pull-right">
				<!--docker product begin-->
				<div class="docker-container-product docker-container-item clearfix">
					<ul>
						<c:forEach items="${patterns}" var="pattern">
							<li class="col-md-2"><img
								src="${pageContext.request.contextPath}/assets/bootstrap/img/background_logo.png"
								class="img-responsive" alt="区">
								<h5>${pattern.pattern}</h5>

								<ul>
									<li><a href="#"
										onclick="trackEvent('nav', 'top_yitiji')">德玛西亚</a></li>
									<li><a href="#"
										onclick="trackEvent('nav', 'top_gaiban')">德玛西亚</a></li>
									<li><a href="#"
										onclick="trackEvent('nav', 'top_zuobianqi')">德玛西亚</a></li>
									<li><a href="#"
										onclick="trackEvent('nav', 'top_dunbianqi')">德玛西亚</a></li>
								</ul></li>
						</c:forEach>
					</ul>
				</div>
				<!--docker product end-->
				<!--docker support begin-->
				<div
					class="docker-container-support docker-container-item col-fix-padding clearfix">
					<ul>
						<li class="col-md-3"><a class="tech"
							href="#"
							onclick="trackEvent('nav', 'top_tech')"><span>&nbsp;</span><span>德玛</span></a></li>
						<li class="col-md-3"><a class="service-1350"
							href="#"
							onclick="trackEvent('nav', 'top_1350')"><span>&nbsp;</span><span>德玛</span></a></li>
						<li class="col-md-3"><a class="six-year"
							href="#"
							onclick="trackEvent('nav', 'top_6year')"><span>&nbsp;</span><span>德玛</span></a></li>
						<li class="col-md-3"><a class="faq"
							href="#"
							onclick="trackEvent('nav', 'top_faq')"><span>&nbsp;</span><span>德玛</span></a></li>
					</ul>
				</div>
				<!--docker support end-->
			</div>
		</div>
	</div>
	<!--sub nav begin-->
</header>