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
<body style="font-size: 15px;">
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
						<li class="active">联盟坑友</li>
					</ol>
					<div class="clearfix"></div>
				</div>
				<!-- container -->
				<div class="panel panel-blue" style="background: #fff;">
					<div class="panel-heading">召唤师管理</div>
					<div class="panel-body pan">
						<a href="${pageContext.request.contextPath}/yxlm/webmaster/firend/create" class="btn btn-md btn-primary" style="margin-left: 20px;margin-top: 20px;">新增</a>
						<a href="#" onclick="deleteMany()" class="btn btn-md btn-danger" style="margin-left: 20px;margin-top: 20px;">批量删除</a>
						<form id="form1" action="${pageContext.request.contextPath}/yxlm/webmaster/firend/batDelete" method="post">
							<div class="form-body pal">
								<table class="table table-bordered table-hover" > 
									<tr>
										<th><input type="checkbox"  onchange="checkAll(this.checked)" /></th>
										<th>召唤师编号</th>
										<th>召唤师头像</th>
										<th>召唤师姓名</th>
										<th>召唤师账号</th>
										<th>召唤师密码</th>
										<th>召唤师性别</th>
										<th>召唤师生日</th>
										<th>召唤师邮箱</th>
										 
										<th>手机号码</th>
										<th>操作</th>
									</tr>
									<c:forEach items="${firends.rows}" var="s">
										<tr>
											<td><input type="checkbox" id="ids" name="ids" value="${s.id}" /></td>
											<td>${s.id}</td>
											<!--  -->
											<td>
											<img src="${pageContext.request.contextPath}${s.headImg}" style="max-width: 64px;max-height: 64px;" alt="" />
											</td>
											<td>${s.name}</td>
											<td>${s.account}</td>
											<td>${s.password}</td>
											<td>${s.gender}</td>
											<td>${s.birthday}</td>
											<td>${s.email}</td>
											
											<td>${s.mobile}</td>
											<td>
												<a href="${pageContext.request.contextPath}/yxlm/webmaster/firend/edit/${s.id}" class="btn btn-md  btn-success" >修改</a>
												<a href="#" onclick="deleteOne(${s.id})" class="btn btn-md btn-danger" >删除</a>
											</td>
										</tr>
									</c:forEach>
								</table>
								<c:if test="${firends.index!=1}">
									<a href="${pageContext.request.contextPath}/yxlm/webmaster/firend/index/${firends.first}" class="btn btn-md btn-success">首页</a>
									<a href="${pageContext.request.contextPath}/yxlm/webmaster/firend/index/${firends.prev}" class="btn btn-md btn-success">上一页</a>
								</c:if>
								第【${firends.index}/${firends.pages}】页
								共${firends.total}条记录
								<c:if test="${firends.index!=firends.pages}">
									<a href="${pageContext.request.contextPath}/yxlm/webmaster/firend/index/${firends.next}" class="btn btn-md btn-success">下一页</a>
									<a href="${pageContext.request.contextPath}/yxlm/webmaster/firend/index/${firends.last}" class="btn btn-md btn-success">未页</a>
								</c:if>
								
								<!-- <button type="submit" class="  text-right pal btn btn-primary" style="margin-left: 400px;border-top-width: 2px;">保存</button> -->
							
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
	<script type="text/javascript">
		function deleteOne(id){
			if(confirm('确认删除吗？')){
				window.location.href='${pageContext.request.contextPath}/yxlm/webmaster/firend/delete/'+id;
			}
		}
		function checkAll(checked){
			var ids  = $('input');
		
			for(i=0;i<ids.length;i++){
				ids[i].checked=checked;
			}
		}
		function deleteMany(){
			if('确认删除吗?'){
				alert("请慎重！！与该朋友的所有记录信息都会被清除（不限于评论，视频，评论回复等）");
				document.getElementById("form1").submit();
			}
		}
	</script>
</body>
</html>
