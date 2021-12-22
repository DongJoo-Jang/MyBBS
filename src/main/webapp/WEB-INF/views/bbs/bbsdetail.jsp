<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>게시글 상세정보</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%@include file="../header.jsp"%>
	<div class="container">
		<h2>상세 보기</h2>
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">작성자:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="userid" name="userid"
					value="${userId}" readonly ">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="titel">작성자:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="title"
					placeholder="제목을 입력하세요" name="title">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="content">내용:</label>
			<div class="col-sm-10">
				<textarea class="form-control" rows="10" id="content" name="content"></textarea>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="button" class="btn btn-info" data-toggle="modal"
					data-target="#reply">답글 작성</button>
			</div>
		</div>
	</div>

<%@include file ="bbsreply.jsp" %>
</body>
</html>