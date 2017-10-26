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
<title>firends</title>
</head>
<body>

	<div style="height: 130px;">
		<jsp:include page="../share/header.jsp" />
	</div>
	<jsp:include page="../share/firend.jsp" />


	<div class="container">
			<h1>firends</h1>
			<img src="${pageContext.request.contextPath}/assets/img/1002.png" alt="..." class="img-circle"> 
			
		<nav aria-label="...">
			<ul class="pagination">
				<li class="disabled"><span> <span aria-hidden="true">&laquo;</span>
				</span></li>
				<li class="active"><span>1 <span class="sr-only">(current)</span></span>
				<li class="active"><span>2 <span class="sr-only">(current)</span></span>
				<li class="active"><span>3 <span class="sr-only">(current)</span></span>
				<li class="active"><span>4 <span class="sr-only">(current)</span></span>
				</li> ...
			</ul>
		</nav>
	</div>

	<jsp:include page="../share/footer.jsp" />

	<jsp:include page="../share/footer_link.jsp" />
</body>
</html>