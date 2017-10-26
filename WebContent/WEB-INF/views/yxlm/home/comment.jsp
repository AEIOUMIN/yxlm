<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html;charset=utf-8" http-equiv="Content-Type" />
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<meta name="renderer" content="webkit" />
<title>野区论坛</title>
</head>
<body>
<div class="container">
	<div>
		<input type="text" name="search" id="search" id="search" />
		<label for="search">搜索</label>
	</div>
	<div class="row">
		<div class="col-md-8">
			<c:forEach items="${comments.rows}" var="c">
				<div>${c.content}</div>
				<div>${c.author}</div>
				<div>${c.createDate}</div>
				<a href="${pageContext.request.contextPath}/yxlm/home/list/${c.id}/${comments.first}">首页</a>
				<a href="${pageContext.request.contextPath}/yxlm/home/list/${c.id}/${comments.prev}">上一页</a>
				共【${comments.index}/${comments.pages}】页
				共${comments.total}记录
				<a href="${pageContext.request.contextPath}/yxlm/home/list/${c.id}/${comments.next}">下页</a>
				<a href="${pageContext.request.contextPath}/yxlm/home/list/${c.id}/${comments.last}">未页</a>
			</c:forEach>
		</div>
		<div class="col-md-4">
			<div>
				${news.title}
				${news.author}
			</div>
		</div>
		
	</div>
</div>

</body>
</html>
