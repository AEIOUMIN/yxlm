<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../share/head_link.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/date/My97DatePicker/WdatePicker.js"></script>
<style type="text/css">
body {
	background-image:
		url("${pageContext.request.contextPath}/assets/bootstrap/img/和.jpg");
	color: white;
}

.container {
	width: 30%;
	margin-top: 40px;
	background-color: black;
}
</style>
</head>
<body>
	<div>
		<div class="container">

			<form id="registerForm" method="post">
				<h2 class="form-signin-heading">召唤师注册</h2>
				<tr>
					<td><label for="name">请输入昵称召唤师</label></td>
					<td><input type="text" id="name" name="name"
						class="form-control" placeholder="请输入昵称" required autofocus>
					</td>
				</tr>
				<tr>
					<td><label for="password">新密码</label>&nbsp;&nbsp;&nbsp;&nbsp;<span
						id="passwordError" style="color: red;"></span></td>
					<td><input type="text" id="password" name="password"
						class="form-control" placeholder="请输入密码6位以上" required></td>
				</tr>
				<tr>
					<td><label for="gender">性别</label></td>
					<td><input type="radio" name="gender" id="gender" value="男">男
						<input type="radio" name="gender" id="gender">女</td>
				</tr>

				<tr>
					<br />
					<td><label for="mobile">手机号</label>&nbsp;&nbsp;&nbsp;&nbsp;<span
						id="mobileError" style="color: red;"></span></td>
					<td><input type="text" id="mobile" name="mobile"
						class="form-control" placeholder="请输入手机号" required></td>
				</tr>
				<tr>
					<td><label for="birthday">出生日期</label></td>
					<td><input type="text" id="birthday" name="birthday"
						readonly="readonly"
						onfocus="WdatePicker({isShowWeek:true,dateFmt:'yyyy-MM-dd HH:mm:ss',skin:'whyGreen',lang:'zh-cn'})"
						class="form-control" placeholder="出生日期" required></td>
				</tr>
				<tr>
					<td><label for="email">邮箱</label>&nbsp;&nbsp;&nbsp;&nbsp;<span
						id="emailError" style="color: red;"></span></td>
						<td> <input type="text"
						id="email" name="email" class="form-control" placeholder="邮箱"
						required></td>
				</tr>

				<tr>
					<td><label for="headImg">请选择头像</label></td>
					<td><input type="text" id="headImg" name="headImg"
						class="form-control" placeholder="请选择头像" required></td>
				</tr>
				<tr>
					<td><input type="button" id="bregister" value="提交"
						class="btn btn-lg btn-success " /></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<td><a
						href="${pagecontext.request.contextPath}/yxlm/yxlm/webmaster/login">
							<button type="button" class="btn btn-lg btn-warning">取消</button>
					</a></td>
				</tr>
				<span id="account" name="account"></span> <span name="error"
					id="error" style="color: white;">${error}</span>
			</form>
		</div>
	</div>
	<jsp:include page="../share/footer_link.jsp" />
	<script type="text/javascript">
		mobileIsExists = false;
		$(function() {
			$("#mobile")
					.on(
							'blur',
							function() {
								$
										.ajax({
											url : '${pageContext.request.contextPath}/yxlm/webmaster/admin/validate/mobile',
											type : 'post',
											data : $('#registerForm')
													.serialize()
													,
											dataType : 'json',
											success : function(result) {
												mobileIsExists = result.success;
												if (!result.success) {
													$('#mobileError').html(
															'手机号已存在');
												} else {
													$('#mobileError').html('');
												}
											}
										});

							});
			$('#password').on('blur', function() {
				if (($('#password').val().length)<6) {
					$('#passwordError').html('密码长度必须大于6位数');
					
				} else {
					$('#passwordError').html('');
					
				}
			});
			$('#email').on('blur',function(){
				$.ajax({
					url:'${pageContext.request.contextPath}/yxlm/webmaster/admin/validate/email',
					type:'post',
					data:$('#registerForm')
					.serialize(),
					dataType:'json',
					success:function(result){
						if(!result.success){
							$('#emailError').html('该邮箱账号已经存在!');
						}else{
							$('#emailError').html('');
						}
					}
				});
			});
			$('#bregister')
					.on(
							'click',
							function() {

								if (!mobileIsExists) {
									return;
								}
								$
										.ajax({
											url : '${pageContext.request.contextPath}/yxlm/webmaster/admin/valid',
											type : 'post',
											data : $('#registerForm')
													.serialize(),
											dataType : 'json',
											success : function(result) {
												alert('手机登录账号:' + result.message
														+ '请牢记!!');
												window.location.href = '${pageContext.request.contextPath}/yxlm/webmaster/login';
											}
										});
							});
			
		});
	</script>
</body>
</html>