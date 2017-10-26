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
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/webmaster/styles/jplist-custom.css">
<!--  -->
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
			<!--nav~~chat-->
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
										<div class="col-lg-12">
											<div class="panel">
												<div class="panel-body">
													<div id="grid-layout-table-1" class="box jplist">
														<div class="jplist-ios-button">
															<i class="fa fa-sort"></i>jPList Actions
														</div>
														<div class="jplist-panel box panel-top">

															<span><a
																href="${pageContext.request.contextPath}/yxlm/webmaster/story/create"
																class="jplist-submit-btn btn btn-md btn-success">新增</a></span>
															<a href="#" onclick="deleteMany()"
																class="btn btn-md btn-danger ">批量删除</a><input
																type="checkbox" onchange="checkAll(this.checked)" />
															&nbsp;&nbsp;&nbsp;&nbsp;召唤师:<strong>${user.name}</strong>
														</div>
														<div class="box text-shadow" style="margin-top: 10px;">
															<form id="form1"
																action="${pageContext.request.contextPath}/yxlm/webmaster/story/batDelete"
																method="post">
																<table border="1px;">

																	<c:forEach items="${pictures.rows}" var="p">
																		<tr class="tbl-item">
																			<!--<img/>-->
																			<td><input type="checkbox" name="ids" id="id"
																				value="${picture.id}" /></td>
																			<td class="img" id="imgSm"><span id="imgtest"><img
																				src="${pageContext.request.contextPath}${p.pictureImg}" style="max-width: 92px;max-height: 92px;" id="imgLg" />
																				</span>
																			</td>
																			<!--<data></data>-->
																			<td class="td-block"><p class="date">${p.createDate}</p>

																				<p class="desc">${p.story}</p>

																				<p class="like">${p.love}</p></td>
																			<td><a
																				href="${pageContext.request.contextPath}/yxlm/webmaster/story/edit/${p.id}"
																				class="btn btn-success">编辑</a> <a href="#"
																				class="btn btn-danger" onclick="deleteOne(${p.id})">删除</a></td>
																		</tr>
																	</c:forEach>

																</table>
																<c:if test="${pictures.index!=1}">
																	<a
																		href="${pageContext.request.contextPath}/yxlm/webmaster/story/index/${pictures.first}"
																		class="btn btn-md btn-success">首页</a>
																	<a
																		href="${pageContext.request.contextPath}/yxlm/webmaster/story/index/${pictures.prev}"
																		class="btn btn-md btn-success">上一页</a>
																</c:if>
																第【${pictures.index}/${pictures.pages}】页
																共${pictures.total}条记录
																<c:if test="${pictures.index!=pictures.pages}">
																	<a
																		href="${pageContext.request.contextPath}/yxlm/webmaster/story/index/${pictures.next}"
																		class="btn btn-md btn-success">下一页</a>
																	<a
																		href="${pageContext.request.contextPath}/yxlm/webmaster/story/index/${pictures.last}"
																		class="btn btn-md btn-success">未页</a>
																</c:if>

																<!-- bootstrap -->
																<nav aria-label="Page navigation">
																	<ul class="pagination pagination-lg">
																		<li><a
																			href="${pageContext.request.contextPath}/yxlm/webmaster/story/index/${pictures.prev}"
																			aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
																		</a></li>
																		
																		<li class="active"><span>${pictures.index}<span
																				class="sr-only">${pictures.index}</span></span></li>
																		<li><a
																			href="${pageContext.request.contextPath}/yxlm/webmaster/story/index/${pictures.next}"
																			aria-label="Next"> <span aria-hidden="true">&raquo;</span>
																		</a></li>
																	</ul>
																</nav>
														</div>


													</div>
												</div>
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
			<!--END PAGE WRAPPER-->
		</div>
	</div>
	<jsp:include page="../share/foot_link.jsp" />
	<script
		src="${pageContext.request.contextPath}/assets/webmaster/script/modernizr.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/webmaster/script/jplist.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/webmaster/script/jplist.js"></script>
	<script type="text/javascript">
		
		$(function() {
			$('#create')
					.on(
							'click',
							function() {
								window.location.href = '${pageContext.request.contextPath}/yxlm/webmaster/story/create';
							});
		});
		function deleteOne(id) {
			if (confirm('确认删除吗？')) {
				window.location.href = '${pageContext.request.contextPath}/yxlm/webmaster/story/delete/'
						+ id;
			}
		}
		function checkAll(checked) {
			var ids = $('input');

			for (i = 0; i < ids.length; i++) {
				ids[i].checked = checked;
			}
		}
		function deleteMany() {
			if ('确认删除吗?') {

				document.getElementById("form1").submit();
			}
		}
	</script>
</body>
</html>
