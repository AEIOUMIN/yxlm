<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach items="${news.rows}" var="n">
	
	<div class="row">
		<div class="col-md-3">
			
			<img alt="" src="${pageContext.request.contextPath}${n.imageUrl}" style="max-width: 128px;max-height: 112px;">
		</div>
		<div class="col-md-9">
			<a href="#"><h4>${n.title}</h4></a>
			
			<p>${n.summary}</p>
		</div>
	</div>
	<hr style="border-color: gray;" />
</c:forEach>
<div class="row">
	<nav aria-label="Page navigation">
		<ul class="pagination">
			<li><a href="#" aria-label="Previous"> <span
					aria-hidden="true">&laquo;</span>
			</a></li>
			<c:forEach begin="1" end="${news.pages}" step="1" var="i">
					<c:choose>
						<c:when test="${news.index==i}">
							<li class="active"><a href="#" onclick="sendId(${topicId}, ${i})">${i}</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="#" onclick="sendId(${topicId}, ${i})">${i}</a></li>
						</c:otherwise>
					</c:choose>
					
			</c:forEach>
			
			<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</a></li>
		</ul>
	</nav>
</div>