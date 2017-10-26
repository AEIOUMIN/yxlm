<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>Login</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css"
	href="${pageContext.request.contextPath}/assets/webmaster/login/googleapisfamily.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/login/googleorword.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/font-awesome.min.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/bootstrap.min.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/animate.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/all.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/main.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/style-responsive.css">
</head>
<body style="background: url('${pageContext.request.contextPath}/assets/bootstrap/img/和.jpg') center center fixed;">
	<div class="page-form">
		<div class="panel panel-blue">
			<div class="panel-body pan">
				<form  class="form-horizontal">
					<div class="form-body pal">
						<div class="col-md-12 text-center">
							<h1 style="margin-top: -90px; font-size: 48px;color:white;">召唤师联盟</h1>
							<br />
						</div>
						<div class="form-group">
							<div class="col-md-3">
								<img src="${pageContext.request.contextPath}/assets/bootstrap/img/英雄联盟.png" class="img-responsive"
									style="margin-top: -35px;" />
							</div>
							<div class="col-md-9 text-center">
								<h1>召唤师,上线</h1>
								<br />
								<p>你很快将会成为传奇人物！！召唤师</p>
							</div>
						</div>
						<div class="form-group">
							<label for="account" class="col-md-3 control-label">
								召唤师账号:</label>
							<div class="col-md-9">
								<div class="input-icon right">
									<i class="fa fa-user"></i> <input id="account" name="account" type="text"
										placeholder="请输入召唤口令(邮箱或者手机号)" class="form-control" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="password" class="col-md-3 control-label">
								召唤师暗号:</label>
							<div class="col-md-9">
								<div class="input-icon right">
									<i class="fa fa-lock"></i> <input id="password" name="password"
										type="text" placeholder="请输入独有的密码" class="form-control" />
								</div>
							</div>
						</div>
						<div class="form-group mbn">
							<div class="col-lg-12" align="right">
								<div class="form-group mbn">
									<div class="col-lg-3">&nbsp;</div>
									<div class="col-lg-9">
										<a href="${pageContext.request.contextPath}/yxlm/webmaster/admin/register" class="btn btn-default" >
        									注册账号
      									 </a>
										<a href="${pageContext.request.contextPath}/index" class="btn btn-default">返回</a>&nbsp;&nbsp;
										<button class="btn btn-default login">欢迎登录</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="col-lg-12 text-center">
			<p>准备好了吗 ?</p>
		</div>
	</div>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/bootstrap/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$('.login').on('click',function(){
				
				document.forms[0].action='${pageContext.request.contextPath}/yxlm/webmaster/validate';
				document.forms[0].submit();
			});
		});
	
	</script>
</body>
</html>
