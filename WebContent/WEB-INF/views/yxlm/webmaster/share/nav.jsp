<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav id="sidebar" role="navigation" data-step="2"
	data-intro="Template has &lt;b&gt;many navigation styles&lt;/b&gt;"
	data-position="right" class="navbar-default navbar-static-side">
	<div class="sidebar-collapse menu-scroll">
		<ul id="side-menu" class="nav">

			<div class="clearfix"></div>
			<c:forEach items="${topics}" var="t">

				<li><a href="${pageContext.request.contextPath}${t.adminUrl}"><i
						class="fa  fa-fw">
							<div class="icon-bg ${t.color}"></div>
					</i><img src="${pageContext.request.contextPath}${t.image}"
						style="width: 50px; height: 50px;" /><span class="menu-title">${t.topicName}</span></a>
						
				</li>
			</c:forEach>

		</ul>
	</div>
</nav>

<div id="chat-form" class="fixed">
	<div class="chat-inner">
		<h2 class="chat-header">
			<a href="javascript:;" class="chat-form-close pull-right"><i
				class="glyphicon glyphicon-remove"> </i></a><i class="fa fa-user"></i>&nbsp;
			聊天框 &nbsp;<span class="badge badge-info">3</span>
		</h2>
		<div id="group-1" class="chat-group">
			<strong>好友</strong><a href="#"><span
				class="user-status is-online"></span> <small> Verna Morton</small> <span
				class="badge badge-info">2</span></a><a href="#"><span
				class="user-status is-online"></span> <small>Delores Blake</small> <span
				class="badge badge-info is-hidden"> 0</span></a><a href="#"><span
				class="user-status is-busy"></span> <small>Nathaniel Morris</small>
				<span class="badge badge-info is-hidden">0</span></a><a href="#"><span
				class="user-status is-idle"></span> <small>Boyd Bridges</small> <span
				class="badge badge-info is-hidden">0</span></a><a href="#"><span
				class="user-status is-offline"></span> <small>Meredith
					Houston</small> <span class="badge badge-info is-hidden">0</span></a>
		</div>
		<div id="group-2" class="chat-group">
			<strong>同事</strong><a href="#"><span class="user-status is-busy"></span>
				<small> Ann Scott</small> <span class="badge badge-info is-hidden">0</span></a><a
				href="#"><span class="user-status is-offline"></span> <small>Sherman
					Stokes</small> <span class="badge badge-info is-hidden"> 0</span></a><a
				href="#"><span class="user-status is-offline"></span> <small>Florence
					Pierce</small> <span class="badge badge-info">1</span></a>
		</div>
		<div id="group-3" class="chat-group">
			<strong>朋友</strong><a href="#"><span
				class="user-status is-online"></span> <small> Willard
					Mckenzie</small> <span class="badge badge-info is-hidden">0</span></a><a
				href="#"><span class="user-status is-busy"></span> <small>Jenny
					Frazier</small> <span class="badge badge-info is-hidden">0</span></a><a
				href="#"><span class="user-status is-offline"></span> <small>Chris
					Stewart</small> <span class="badge badge-info is-hidden">0</span></a><a
				href="#"><span class="user-status is-offline"></span> <small>Olivia
					Green</small> <span class="badge badge-info is-hidden">0</span></a>
		</div>
	</div>
	<div id="chat-box" style="top: 400px">
		<div class="chat-box-header">
			<a href="#" class="chat-box-close pull-right"><i
				class="glyphicon glyphicon-remove"> </i></a><span
				class="user-status is-online"></span><span class="display-name">Willard
				Mckenzie</span> <small>Online</small>
		</div>
		<div class="chat-content">
			<ul class="chat-box-body">
				<li>
					<p>
						<img src="images/avatar/128.jpg" class="avt" /><span class="user">John
							Doe</span><span class="time">09:33</span>
					</p>
					<p>Hi Swlabs, we have some comments for you.</p>
				</li>
				<li class="odd">
					<p>
						<img src="images/avatar/48.jpg" class="avt" /><span class="user">Swlabs</span><span
							class="time">09:33</span>
					</p>
					<p>Hi, we're listening you...</p>
				</li>
			</ul>
		</div>
		<div class="chat-textarea">
			<input placeholder="你的留言" class="form-control" />
		</div>
	</div>
</div>