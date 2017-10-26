<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>英雄联盟 |英雄联盟</title>
<jsp:include page="../share/title.jsp" />
<!--Loading bootstrap css-->
<jsp:include page="../share/link.jsp" />
</head>
<body>
	<div>

		<!--BEGIN BACK TO TOP-->
		<a id="totop" href="#"><i class="fa fa-angle-up"></i></a>
		<!-- 顶部 -->
		<jsp:include page="../share/top.jsp" />
		<!--END TOPBAR-->
		<div id="wrapper">
			<!--nav~~chat-->
			<jsp:include page="../share/nav.jsp" />
			<!--开始页面包装容器-->
			<div id="page-wrapper">
				<!--BEGIN TITLE & BREADCRUMB PAGE-->
				<div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
					<div class="page-header pull-left">
						<div class="page-title">联盟坑友</div>
					</div>
					<ol class="breadcrumb page-breadcrumb pull-right">
						<li><i class="fa fa-home"></i>&nbsp;<a href="dashboard.html">首页</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="hidden"><a href="#">联盟坑友</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>

						<li class="active">联盟坑友</li>&nbsp;&nbsp;
						<i class="fa fa-angle-right"></i>&nbsp;&nbsp;
						</li>
						<li class="active">新增</li>
					</ol>
					<div class="clearfix"></div>
				</div>
				<!-- container -->
				<div class="panel panel-blue"
					style="background: #fff; font-weight: bolder;">
					<div class="panel-heading">修改</div>


					<div class="panel-body pan ">
						<form action="${pageContext.request.contextPath}/yxlm/webmaster/firend/save" method="post">
							<div class="form-body pal">
								<div class="row">
									<div class="col-md-4">
										<div class="row">

											<div class="form-group">
												<label for="name" class="control-label">召唤师姓名</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> 
													<input type="hidden" name="id"  value="${firend.id}"/>
													<input id="name" type="text"
														name="name" placeholder="" class="form-control" value="${firend.name}"/>
												</div>
											</div>


										</div>
										<div class="row">

											<div class="form-group">
												<label for="account" class="control-label">账号</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> <input id="account" type="text"
														name="account" placeholder="" readonly="readonly" class="form-control" value="${firend.account}"/>
												</div>
											</div>


										</div>
										<div class="row">

											<div class="form-group">
												<label for="password" class="control-label">密码</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> <input id="password" type="text"
														name="password" placeholder="" class="form-control" value="${firend.password}"/>
												</div>
											</div>


										</div>
										<div class="row">

											<div class="form-group">
												<label for="gender" class="control-label">性别</label>
												&nbsp;&nbsp;&nbsp;&nbsp; 
												<c:choose>
													<c:when test="${firend.gender=='男' }">
													<input id="gender" type="radio"
													name="gender" placeholder="" value="男" checked="checked" />男
												&nbsp;&nbsp;&nbsp;&nbsp;<input id="gender" type="radio"
													name="gender" placeholder="" value="女" />女
													</c:when>
													<c:otherwise>
														<input id="gender" type="radio"
													name="gender" placeholder="" value="男"  />男
												&nbsp;&nbsp;&nbsp;&nbsp;<input id="gender" type="radio"
													name="gender" placeholder="" value="女" checked="checked"/>女
													</c:otherwise>
												</c:choose>
											</div>

										</div>
										<div class="row">

											<div class="form-group">
												<label for="birthday" class="control-label">出生日期</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> <input type="text" id="birthday"
														name="birthday" readonly="readonly"
														onfocus="WdatePicker({isShowWeek:true,dateFmt:'yyyy-MM-dd HH:mm:ss',skin:'whyGreen',lang:'zh-cn'})"
														class="form-control" placeholder=" 出生日期" value="${firend.birthday}" required>
												</div>
											</div>

										</div>
										<div class="row">

											<div class="form-group">
												<label for="email" class="control-label">邮箱</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> <input id="email" type="text"
														name="email" placeholder="" class="form-control" value="${firend.email}"/>
												</div>
											</div>


										</div>

										<div class="row">

											<div class="form-group">
												<label for="mobile" class="control-label">手机号码</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> <input id="mobile" type="text"
														name="mobile" class="form-control" value="${firend.mobile}"/>
												</div>
											</div>


										</div>
									</div>
									<div class="col-md-8">
										<!-- +++++++++++图片上传++++++++++++ -->
										<div class="row">

											<div class="form-group">
												<label for="headImg" class="control-label">头像</label>
												<div class="input-icon right">
													<input type="hidden" name="headImg" id="headImg" />
													 <input id="photo" type="file"
														onchange="fileUpload()" class="file" />
													<img src="${pageContext.request.contextPath}${firend.headImg}" style="max-height: 64px;max-width: 64px;" name="pic" id="pic"/>
												</div>

											</div>

										</div>
									</div>
								</div>


								</table>
							</div>
							<div class="form-actions text-right pal">
								<button type="submit" class="btn btn-primary">保存</button>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="${pageContext.request.contextPath}/yxlm/webmaster/firend/index/1" class="btn btn-danger">返回</a>
							</div>
							
						</form>
					</div>


				</div>
				<!-- footer -->
				<jsp:include page="../share/footer.jsp" />
			</div>
			<!--END PAGE WRAPPER-->
		</div>
	</div>
	<jsp:include page="../share/foot_link.jsp" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/fliestyle/bootstrap-filestyle.min.js"></script>
	<script type="text/javascript">
		var count =1;
		$(function(){
			$(":file").filestyle({
				input:false,
				iconName: "glyphicon glyphicon-folder-open" , 
				buttonText: "选择图片",
				buttonName: "btn-default",
				
			});
		});
		function fileUpload(){
			var files = document.getElementById("photo").files;
			count =2;
			if(files.length<1)
			{
				return;
			}
			var formData = new FormData();
			
			for(var i=0;i<files.length;i++){
				formData.append("photo",files[i]);
			}
			
			$.ajax({
	            type:"post",
	            url:"${pageContext.request.contextPath}/yxlm/webmaster/firend/upload",
	            data:formData,
	            processData : false,
	            contentType : false,
	        	success:function(data){
	        		$('#headImg').val(data.headImg);
	                $("#pic").prop("src",data.src);
	            }
	        });
		}
		if(count==1){
			$(function(){
				$('#headImg').val("${firend.headImg}");
			});
		}
	</script>
	

</body>
</html>
