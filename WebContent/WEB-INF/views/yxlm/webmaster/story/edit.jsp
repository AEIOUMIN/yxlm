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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/date/My97DatePicker/WdatePicker.js"></script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/jplist-custom.css">
</head>
<body>
	<div>
		<!--BEGIN THEME SETTING-->
		<div id="theme-setting">
			<a href="#" data-toggle="dropdown" data-step="1"
				data-intro="&lt;b&gt;Many styles&lt;/b&gt; and &lt;b&gt;colors&lt;/b&gt; be created for you. Let choose one and enjoy it!"
				data-position="left" class="btn-theme-setting"><i
				class="fa fa-cog"></i></a>
			<div class="content-theme-setting">
				<select id="list-style" class="form-control">
					<option value="style1">锐利</option>
					<option value="style2">浑源</option>
					<option value="style3" selected="selected">淡化</option>
				</select>
			</div>
		</div>
		<!--END THEME SETTING-->
		<!--BEGIN BACK TO TOP-->
		<a id="totop" href="#"><i class="fa fa-angle-up"></i></a>
		<!-- 顶部 -->
		<jsp:include page="../share/top.jsp" />
		<!--END TOPBAR-->
		<div id="wrapper">
			
			<jsp:include page="../share/nav.jsp" />
			<div id="page-wrapper">
				<!--BEGIN TITLE & BREADCRUMB PAGE-->
				<div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
					<div class="page-header pull-left">
						<div class="page-title">英雄故事</div>
					</div>
					<ol class="breadcrumb page-breadcrumb pull-right">
						<li><i class="fa fa-home"></i>&nbsp;<a href="dashboard.html">首页</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="hidden"><a href="#">英雄故事</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="active">英雄故事</li>
					</ol>
					<div class="clearfix"></div>
				</div>
				<!--END TITLE & BREADCRUMB PAGE-->
				<!--BEGIN CONTENT-->
				<div class="page-content">
					<div id="tab-general">
						<div class="row mbl">
							<div class="col-lg-12">

								<div class="col-md-12">
									<div id="area-chart-spline"
										style="width: 100%; height: 300px; display: none;"></div>
								</div>

							</div>

							<div class="col-lg-12">

								<div class="page-content">
									<div class="row">

										<div id="grid-layout-table-1" class="box jplist">
											
											<div class="jplist-panel box panel-top">
										

												<div class="box text-shadow">

													<table class="demo-tbl">
														<!--<item>1</item>-->

														<div class="panel panel-green">
															<div class="panel-heading">英雄故事</div>
															<div class="panel-body pan">
																<form id="storyForm"
																	action="${pageContext.request.contextPath}/yxlm/webmaster/story/save"
																	method="post" >
																	<div class="form-body pal">
																		<div class="row">

																			<div class="form-group">
																				<div class="col-md-6">
																					<label for="inputName" class="control-label">
																						Name</label>
																					<div class="input-icon right">
																						<i class="fa fa-user"></i> <select id="heroName"
																							name="heroName">
																							<c:forEach items="${heros}" var="h">
																								<option value="${h.heroName}">${h.heroName}</option>
																							</c:forEach>

																						</select>
																					</div>
																				</div>
																				<div class="col-md-6">
																					<label for="pictureImg"> 英雄照片</label>
																					<div>
																						<input type="hidden" name="id" value="${picture.id}" />
																						<input type="hidden" name="pictureImg" id="pictureImg" /> 
																						<input id="photo" type="file"  onchange="filespload()" class="file" /> 
																							<img src="${pageContext.request.contextPath}${picture.pictureImg}" name="pic" id="pic" style="max-width: 92px;max-height: 92px;" />
																						
																					</div>
																				</div>
																			</div>

																			<br />

																			<div>
																				<label class="control-label">新增日期</label> <input
																					type="text" id="createDate" name="createDate"
																					readonly="readonly"
																					onfocus="WdatePicker({isShowWeek:true,dateFmt:'yyyy-MM-dd HH:mm:ss',skin:'whyGreen',lang:'zh-cn'})"
																					class="form-control" placeholder=" 新增日期" required>
																			</div>
																			<br />
																			<div>
																				<h1>英雄故事</h1>
																				<textarea id="editor1" name="story" >${picture.story}</textarea>
																			</div>

																		</div>
																		<div class="form-actions text-right pal">
																			<input type="submit"
																				class="jplist-reset-btn btn btn-lg btn-primary"
																				value="保存"> <a
																				href="${pageContext.request.contextPath}/yxlm/webmaster/story/index/1"
																				class="jplist-reset-btn btn btn-lg btn-danger">取消</a>
																		</div>
																</form>
															</div>
														</div>
													</table>
												</div>


											</div>
										</div>

									</div>

								</div>

							</div>
						</div>
					</div>
					<!-- footer -->
					<jsp:include page="../share/footer.jsp" />
				</div>
			</div>
		</div>
		<jsp:include page="../share/foot_link.jsp" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/ckeditor/ckeditor.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/webmaster/script/modernizr.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/webmaster/script/jplist.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/webmaster/script/jplist.js"></script>
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
					
					CKEDITOR.replace('editor1');
					
				});
			
				function filespload(){
					var files = document.getElementById("photo").files;
					count=2;
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
			            url:"${pageContext.request.contextPath}/yxlm/webmaster/story/upload",
			            data:formData,
			            processData : false,
			            contentType : false,
			        	success:function(data){
			        		alert('success');
			        		$('#pictureImg').val(data.pictureImg);
			                $("#pic").prop("src",data.src);
			            }
			        });
				}
				if(count==1){
					$(function(){
						$('#pictureImg').val('${picture.pictureImg}');
					});
				}
			</script>
		
</body>
</html>
