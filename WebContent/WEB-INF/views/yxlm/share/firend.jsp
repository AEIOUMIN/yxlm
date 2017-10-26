<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="index-product-series align-vertical container" >
		<ul class="toggle-icon clearfix exclude-default">
			<c:forEach items="${patterns}" var="p">
				<li>
				
				<a class="toggle clearfix" href="javascript:;"> <span><img
							src="${pageContext.request.contextPath}/assets/bootstrap/img/u=3822331685,624091293&fm=27&gp=0.jpg"
							data-img-on="${pageContext.request.contextPath}/assets/bootstrap/img/u=1405027452,3230512517&fm=27&gp=0.jpg"
							data-img-off="${pageContext.request.contextPath}/assets/bootstrap/img/u=2326628902,221396746&fm=214&gp=0.jpg"
							class="center-block img-responsive"></span> <span>${p.pattern}</span>
				</a>

					<ul>
						<c:forEach items="${firends}" var="f">
							<li><a href="/product/intelligent-toilet/"
								onclick="trackEvent('nav', 'middle_yitiji')">${f.name}</a></li>
						</c:forEach>

					</ul></li>
			</c:forEach>

		</ul>
	</div>