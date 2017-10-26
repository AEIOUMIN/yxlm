<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						<div class="page-title">联盟新闻</div>
					</div>
					<ol class="breadcrumb page-breadcrumb pull-right">
						<li><i class="fa fa-home"></i>&nbsp;<a href="dashboard.html">首页</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="hidden"><a href="#">联盟新闻</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>

						<li class="active">联盟新闻</li>&nbsp;&nbsp;
						<i class="fa fa-angle-right"></i>&nbsp;&nbsp;
						</li>
						<li class="active">新增</li>
					</ol>
					<div class="clearfix"></div>
				</div>
				<!-- container -->
				<div class="panel panel-blue"
					style="background: #fff; font-weight: bolder;">
					<div class="panel-heading">新增</div>


					<div class="panel-body pan ">
						<form
							action="${pageContext.request.contextPath}/yxlm/webmaster/new/save"
							method="post">
							<div class="form-body pal">
								<div class="row">
									<div class="col-md-4">

										<div class="row">

											<div class="form-group">
												<label for="title" class="control-label">联盟新闻标题</label>
												<div class="input-icon right">
													 <input id="title" type="text"
														name="title" placeholder="" class="form-control" />
												</div>
											</div>
										</div>
										<div class="row">

											<div class="form-group">
												<label for="author" class="control-label">联盟新闻作者</label>
												<div class="input-icon right">
													 <input id="author" type="text"
														name="author" placeholder="" class="form-control" />
												</div>
											</div>
										</div>
										<div class="row">

											<div class="form-group">
												<label for="topic" class="control-label">联盟板块</label>
												<div class="input-icon right">
													<select id="topic" name="topic.id">
														<c:forEach items="${topics}" var="t">
															<option value="${t.id}">${t.topicName}</option>
														</c:forEach>

													</select>
												</div>
											</div>

										</div>
										
										<!-- +++++++++++ -->

										<div class="row">

											<div class="form-group">
												<label for="createDate" class="control-label">新增日期</label>
												<div class="input-icon right">
													 <input type="text"
														id="createDate" name="createDate" readonly="readonly"
														onfocus="WdatePicker({isShowWeek:true,dateFmt:'yyyy-MM-dd HH:mm:ss',skin:'whyGreen',lang:'zh-cn'})"
														class="form-control" placeholder="新增日期" required>
												</div>
											</div>

										</div>
										<div class="row">

											<div class="form-group">
												<label for="modifyDate" class="control-label">修改日期</label>
												<div class="input-icon right">
													 <input type="text"
														id="modifyDate" name="modifyDate" readonly="readonly"
														onfocus="WdatePicker({isShowWeek:true,dateFmt:'yyyy-MM-dd HH:mm:ss',skin:'whyGreen',lang:'zh-cn'})"
														class="form-control" placeholder="修改日期" required>
												</div>
											</div>

										</div>
										
										
									</div>
									<div class="col-md-8">
										<div class="row" style="margin-left: 20px;">
											<div class="form-group">
												<label for="summary" class="control-label">联盟新闻摘要</label>
												<div class="input-icon right">
													
													<textarea name="summary" rows="3" cols="55"></textarea>
												</div>
											</div>
										</div>
										<!-- +++++++++++图片上传++++++++++++ -->
										
										<div class="row">
											<div class="col-md-offset-1 col-md-11">
												<div class="form-group">
													<label for="imageUrl" class="control-label">头像</label>
													<div class="input-icon right">
														<input type="hidden" name="imageUrl" id="imageUrl" /> <input
															id="photo" type="file" onchange="fileUpload()"
															class="file" /> <img src=""
															style="max-height:270px; max-width:320px;" name="pic"
															id="pic" />
													</div>

												</div>
											</div>
										</div>

									</div>
									</div>
									<div class="row">

											<div >
												<label for="text">联盟新闻内容</label>
												<div>
													
													<textarea name="text" id="editor1" rows="15" cols="80"></textarea>
												</div>
											</div>
										</div>
									</table>
								</div>
								<div class="form-actions text-right pal">
									<input type="submit" class="btn btn-primary" value="提交" />
									
									<a
										href="${pageContext.request.contextPath}/yxlm/webmaster/new/index/1"
										class="btn btn-info">返回</a>
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/ckeditor/ckeditor.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/fliestyle/bootstrap-filestyle.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$(":file").filestyle({
				input : false,
				iconName : "glyphicon glyphicon-folder-open",
				buttonText : "选择图片",
				buttonName : "btn-default",

			});
			
			CKEDITOR.replace('editor1');
			
		});
		function fileUpload() {
			var files = document.getElementById("photo").files;

			if (files.length < 1) {
				return;
			}
			var formData = new FormData();

			for (var i = 0; i < files.length; i++) {
				formData.append("photo", files[i]);
			}

			$
					.ajax({
						type : "post",
						url : "${pageContext.request.contextPath}/yxlm/webmaster/new/upload",
						data : formData,
						processData : false,
						contentType : false,
						success : function(data) {
							$('#imageUrl').val(data.imageUrl);
							$("#pic").prop("src", data.src);
						}
					});
		}
	</script>

</body>
</html>
