<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Goodee</a>
			</div>
			<ul class="nav navbar-nav navbar-left">
				<li><a href="./boardList.do">게시판</a></li>
				<c:if test="${fn:trim(sessionScope.lvo.auth) eq 'U' }">
					<li><a href="./insertBoardForm.do">글작성</a></li>
				</c:if>
				<c:if test="${fn:trim(sessionScope.lvo.auth) eq 'A' }">
					<li><a href="#">회원리스트</a></li>
				</c:if>
			</ul>


			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"> ${lvo.name}님 환영합니다(${lvo.auth == 'U'?"사용자":"관리자"})
				</a></li>
				<li><a href="./logout.do"><span
						class="glyphicon glyphicon-log-out"></span> 로그아웃</a></li>
			</ul>
		</div>
	</nav>
</body>
