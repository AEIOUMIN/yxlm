<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../share/head_link.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	background-image: url("");
}
</style>
<title>历练之路</title>
</head>
<body>

	<div style="height: 130px;">
		<jsp:include page="../share/header.jsp" />
	</div>
	<jsp:include page="../share/firend.jsp" />


	<div class="container">
		<div class="hot-product auto-vertical-align">
			<div id="carousel-example-generic" class="carousel slide"
				style="margin-top: 25px" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img
							src="${pageContext.request.contextPath}/assets/bootstrap/img/刀女.jpg"
							alt="...">
						<div class="carousel-caption">刀女</div>
					</div>
					<div class="item">
						<img
							src="${pageContext.request.contextPath}/assets/bootstrap/img/慎.jpg"
							alt="...">
						<div class="carousel-caption">慎</div>
					</div>
					<div class="item">
						<img
							src="${pageContext.request.contextPath}/assets/bootstrap/img/狐狸.jpg"
							alt="...">
						<div class="carousel-caption">狐狸</div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
	</div>

	<jsp:include page="../share/footer.jsp" />

	<jsp:include page="../share/footer_link.jsp" />
</body>
</html>