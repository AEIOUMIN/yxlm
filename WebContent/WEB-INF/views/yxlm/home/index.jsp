<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../share/head_link.jsp" />


<title>首页</title>
</head>

<body>
	<jsp:include page="../share/header.jsp" />
	<div class="index-banner swiper-container custom-swiper">
		<div class="swiper-wrapper">
			<div class="swiper-slide theme-bright">
				<a href="#"
					onclick="trackEvent('nav', 'hp_KV3')"><img
					src="${pageContext.request.contextPath}/assets/bootstrap/img/和.jpg"
					alt="恒于心 专于质" class="img-responsive" alt=""></a>
				<div class="slide-container" style="top: 56%; left: 54%;">
					<a class="btn-hegii btn-hegii-default"
						onclick="trackEvent('nav', 'hp_KV3')" href="#">了解详情</a>
				</div>
			</div>

		</div>
		<div class="swiper-pagination adjustment-pagination"></div>
	</div>
	<jsp:include page="../share/firend.jsp" />
	<div class="full-width special-product">
		<img
			src="${pageContext.request.contextPath}/assets/bootstrap/img/index11.jpg"
			class="img-responsive" alt="恒洁智能双Q系列"> <a href="/double-q/"
			class="btn-hegii btn-hegii-default">欢迎来到英雄联盟!</a>
	</div>
	<div class="row">
		<div class="col-md-8">
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
		<div class="col-md-4" style="margin-top: 30px;">
			<button type="button" class="btn  btn-default btn-lg btn-warning">

				<span class="glyphicon glyphicon-download-alt" aria-hidden="true">

					<img
					src="${pageContext.request.contextPath}/assets/bootstrap/img/英雄联盟.png"
					alt="英雄联盟下载">
				</span>

			</button>
			<button type="button" class="btn btn-primary btn-lg btn-block" onc>（块级元素）Block
				level button</button>
			<button type="button" class="btn btn-default btn-lg btn-block">（块级元素）Block
				level button</button>
			<button type="button" class="btn btn-primary btn-lg btn-block">（块级元素）Block
				level button</button>
			<button type="button" class="btn btn-default btn-lg btn-block">（块级元素）Block
				level button</button>
		</div>
	</div>
	<div class="recommend clearfix" style="margin-top: 150px">
		<div class="col-md-3">
			<div class="toggle-mask">
				<a href="#"> <img
					src="${pageContext.request.contextPath}/assets/bootstrap/img/萌萌.jpg"
					class="img-responsive" alt="萌萌">
					<div class="mask">萌萌</div>
				</a>
			</div>
		</div>
		<div class="col-md-3">
			<div class="toggle-mask">
				<a href="#"> <img
					src="${pageContext.request.contextPath}/assets/bootstrap/img/萌萌.jpg"
					class="img-responsive" alt="萌萌">
					<div class="mask">萌萌</div>
				</a>
			</div>
		</div>
		<div class="col-md-3">
			<div class="toggle-mask">
				<a href="#"> <img
					src="${pageContext.request.contextPath}/assets/bootstrap/img/萌萌.jpg"
					class="img-responsive" alt="萌萌">
					<div class="mask">萌萌</div>
				</a>
			</div>
		</div>
		<div class="col-md-3">
			<div class="toggle-mask">
				<a href="#"> <img
					src="${pageContext.request.contextPath}/assets/bootstrap/img/光辉.jpg"
					class="img-responsive" alt="光辉">
					<div class="mask">光辉</div>
				</a>
			</div>
		</div>
	</div>

	<jsp:include page="../share/footer.jsp" />

	<jsp:include page="../share/footer_link.jsp" />
</body>
</html>