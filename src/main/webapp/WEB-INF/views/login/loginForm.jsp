<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <style type="text/css">
  	#container{
  		border: 5px solid blue;
  		width: 400px;
  		height: 350px;
  		position: relative;
  		margin: auto;
  		top: 160px;
  		padding: 50px;
  	}
  	
  	#title{
  		margin-top: 20px;
  		margin-bottom: 20px;
  		text-align: center;
  		font-size: 30px;
  		font-weight: bold;
  		color: blue;
  	}
  
  </style>
</head>
<body>

<div id="container">
	<div id="title">로그인</div>
	<form action="./login.do" method="post">
		<div id="userid" class="form-group">
			<label for="userId">아이디</label>
			<input type="text" class="form-control" name="userId" placeholder="아이디를 입력해주세요" required>
		</div>
		<div id="userpw" class="form-group">
			<label for="pw">비밀번호</label>
			<input type="password" class="form-control" name="pw" placeholder="비밀번호를 입력해주세요" required>
		</div>
		<div style="text-align: center; padding-top: 20px">
			<input type="submit" value="로그인">
			<input type="button" value="회원가입" onclick="location.href='./signupForm.do'">
		</div>
	</form>

</div>

</body>
</html>