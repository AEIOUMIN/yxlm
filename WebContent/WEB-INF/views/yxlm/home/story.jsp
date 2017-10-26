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
<title>story</title>
</head>
<body>

	<div style="height: 130px;">
		<jsp:include page="../share/header.jsp" />
	</div>
	<jsp:include page="../share/firend.jsp" />

	<div class="container">
		<div class="container">
			<div>
				<ul class="pagination pagination-lg">
					<li><a
						href="${pageContext.request.contextPath}/yxlm/home/story/${pictures.prev}">&laquo;</a></li>
					<c:forEach begin="1" end="${pictures.pages}" step="1" var="i">
						<c:choose>
							<c:when test="${pictures.index==i}">
								<li class="active"><a
									href="${pageContext.request.contextPath}/yxlm/home/story/${i}">${i}</a></li>

							</c:when>
							<c:otherwise>
								<li ><a
									href="${pageContext.request.contextPath}/yxlm/home/story/${i}">${i}</a></li>
								
							</c:otherwise>
						</c:choose>
					</c:forEach>

					<li><a
						href="${pageContext.request.contextPath}/yxlm/home/story/${pictures.next}">&raquo;</a></li>
				</ul>
			</div>
			<c:forEach items="${pictures.rows}" var="p">
				<div class="row">
					<div class="col-md-6 ">
						<h2 class="product-header">
							<strong>${p.heroName}</strong>
						</h2>
						<span class="center-line"></span>
						<p class="sub-text margin40">
							${p.story} <br>
						</p>


						<a href="https://www.baidu.com/" class="btn btn-theme-bg btn-lg"
							style="margin: -20px 0 0 0;">了解更多</a>
					</div>
					<div class="col-md-6">
						<img class="img-responsive"
							src="${pageContext.request.contextPath}${p.pictureImg}" alt=""
							style="margin: auto; margin-top: 150px;" />
					</div>
				</div>
			</c:forEach>


			<div>
				<ul class="pagination pagination-lg">
					<li><a
						href="${pageContext.request.contextPath}/yxlm/home/story/${pictures.prev}">&laquo;</a></li>
					<li class="active"><a
						href="${pageContext.request.contextPath}/yxlm/home/story/${pictures.index}">${pictures.index}</a></li>

					<li><a
						href="${pageContext.request.contextPath}/yxlm/home/story/${pictures.next}">&raquo;</a></li>
				</ul>
			</div>

		</div>

	</div>
	<hr />
	<jsp:include page="../share/footer.jsp" />

	<jsp:include page="../share/footer_link.jsp" />
</body>
</html>