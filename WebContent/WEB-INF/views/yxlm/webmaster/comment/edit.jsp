<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<div class="page-title">野区论坛</div>
					</div>
					<ol class="breadcrumb page-breadcrumb pull-right">
						<li><i class="fa fa-home"></i>&nbsp;<a href="dashboard.html">首页</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="hidden"><a href="#">野区论坛</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>

						<li class="active">野区论坛</li>&nbsp;&nbsp;
						<i class="fa fa-angle-right"></i>&nbsp;&nbsp;
						</li>
						<li class="active">修改</li>
					</ol>
					<div class="clearfix"></div>
				</div>
				<!-- container -->
				<div class="panel panel-blue"
					style="background: #fff; font-weight: bolder;">
					<div class="panel-heading">修改</div>


					<div class="panel-body pan ">
						<form
							action="${pageContext.request.contextPath}/yxlm/webmaster/comment/save" method="post" >
							<div class="form-body pal">
								<div class="row">
									
										<div class="row">

											<div class="form-group">
												<label for="author" class="control-label">评论作者</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i>
													<input type="hidden" name="id" id="id" value="${comment.id}" />
													<h3><span name="author">${user.name}</span></h3>
												</div>
											</div>

										</div>
										<div class="row">

											<div class="form-group">
												<label for="content" class="control-label">评论内容</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> 
													<textarea rows="3" cols="45" name="content" value="${comment.content}"></textarea>
												</div>
											</div>


										</div>
										
										<div class="row">

											<div class="form-group">
												<label for="birthday" class="control-label">评论时间</label>
												<div class="input-icon right">
													<i class="fa fa-user"></i> <input type="text" id="birthday"
														name="birthday" readonly="readonly"
														onfocus="WdatePicker({isShowWeek:true,dateFmt:'yyyy-MM-dd HH:mm:ss',skin:'whyGreen',lang:'zh-cn'})"
														class="form-control" placeholder=" 出生日期" required>
												</div>
											</div>

										</div>
									
									
								</div>


								</table>
							</div>
							<div class="form-actions text-right pal">
								<button type="submit" class="btn btn-primary">保存</button>
								<a
									href="${pageContext.request.contextPath}/yxlm/webmaster/comment/index/1"
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/fliestyle/bootstrap-filestyle.min.js"></script>
</body>
</html>
