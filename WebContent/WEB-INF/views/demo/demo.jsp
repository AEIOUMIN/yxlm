<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	输入验证信息:
	<form id="formDemo">
		<input type="text" id="id" name="id" />
		<input type="text" id="topicName" name="topicName" />	
	</form>
	<button id="demo">单击</button>
	<span id="message"></span>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/bootstrap/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$('#demo').click(function(){
			$.ajax({
				url:'${pageContext.request.contextPath}/demo/details',
				type:'post',
				data:$('#formDemo').serialize(),
				dataType:'json',
				success:function(result){
					$('#message').html(result.id+" "+result.topicName);
				}
			});
		});
	});
</script>
</body>
</html>