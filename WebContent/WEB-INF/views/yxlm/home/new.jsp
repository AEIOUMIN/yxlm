<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../share/head_link.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	li{
	list-style: none;
	}
</style>
<title>朋友</title>
</head>
<body>

	<div style="height: 130px;">
		<jsp:include page="../share/header.jsp" />
	</div>



	<div class="container">
		<div class="row">
			<div class="col-md-2">
				<c:forEach items="${topics}" var="topic">
						&nbsp;&nbsp;&nbsp;&nbsp;
						<li class="" style="a: hover{background-color:yellow;">
						<button type="button" class="btn btn-md  btn-danger"
							style="color: black;" onmousemove="sendId(${topic.id},1)">
							<strong id="topicName">${topic.topicName}</strong>
						</button>
					</li>
				</c:forEach>
			</div>
			<div class="col-md-10" id="newShow">
				
					
				
			</div>

		</div>


	</div>

	<jsp:include page="../share/footer.jsp" />

	<jsp:include page="../share/footer_link.jsp" />
	<script type="text/javascript">
		
		function sendId(id, pageIndex){
			
			$('#newShow').load('${pageContext.request.contextPath}/yxlm/home/newShow/'+id+"/"+pageIndex);
		
		}
		
	</script>
</body>
</html>