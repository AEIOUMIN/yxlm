<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<footer style="background-color: black;">

		<div class="container" >
			<div class="clearfix footer-nav">
				<div class="col-md-8">
					<ul class="col-md-3">
						<li><h3>英雄联盟</h3></li>
						<c:forEach items="${patterns}" var="p">
							<li><a href="#"
							onclick="trackEvent('nav', 'btm_bestseller')">${p.pattern}</a></li>		
						</c:forEach>
						
					</ul>
					<ul class="col-md-3">
						<li><h3>英雄联盟</h3></li>
						<c:forEach items="${patterns}" var="p">
							<li><a href="#"
							onclick="trackEvent('nav', 'btm_bestseller')">${p.pattern}</a></li>		
						</c:forEach>
					</ul>
					<ul class="col-md-3">
						<li><h3>英雄联盟</h3></li>
						<c:forEach items="${patterns}" var="p">
							<li><a href="#"
							onclick="trackEvent('nav', 'btm_bestseller')">${p.pattern}</a></li>		
						</c:forEach>
					</ul>
					<ul class="col-md-3">
						<li><h3>英雄联盟</h3></li>
						<c:forEach items="${patterns}" var="p">
							<li><a href="#"
							onclick="trackEvent('nav', 'btm_bestseller')">${p.pattern}</a></li>		
						</c:forEach>
				</div>
				<div class="col-md-4">
					<div class="footer-logo">
						<img src="${pageContext.request.contextPath}/assets/bootstrap/img/ttmm.png"
							class="img-responsive">
					</div>
					<p>全国服务热线</p>
					<p class="tel">1111111111</p>
					<div class="footer-social clearfix">
						<p>关注我们：</p>
						<div class="social-wechat">
							<a class="" href="javascript:;"
								onclick="trackEvent('nav', 'btm_wechat')"></a>
							<div class="social-wechat-pop">
								<img src="/assets/images/qrcode-wechat-footer.jpg"
									class="img-responsive">
							</div>
						</div>
						<div class="social-weibo">
							<a class="" href="#" target="_blank"
								onclick="trackEvent('nav', 'btm_weibo')"></a>
						</div>
					</div>
					<p>服务时间：8:30-12:00,13:30-18:00</p>
				</div>
			</div>
			<div class="clearfix copyright">
				<div class="col-md-5">
					<ul>
						<li><a onclick="trackEvent('nav', 'btm_privacy')"
							href="#">隐私声明</a></li>
						<li><a onclick="trackEvent('nav', 'btm_legal')"
							href="#">法律声明</a></li>
						<li><a onclick="trackEvent('nav', 'btm_contact')"
							href="#">联系我们</a></li>
						<li><a onclick="trackEvent('nav', 'btm_sitemap')"
							href="#">网站地图</a></li>
					</ul>
				</div>
				<div class="col-md-7">
					(～￣▽￣)～有限公司版权所有♪(^∇^*)<br> <small>O(∩_∩)O哈哈~</small>
				</div>
			</div>

		</div>
	</footer>