<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>

</style>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file ="../header.jsp" %>
<div class="container">
  <div class="btn-group">
    <button type="button" onclick="location.href='insertForm.do'" class="btn btn-primary">글작성</button>
  </div>

  <table class="table table-condensed">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="bbs" items="${lists}" varStatus="vs">
      
      
      <tr>
        <td>${bbs.seq }</td>
        <td>${bbs.title }</td>
        <td>${bbs.userid }</td>
        <td>${bbs.regdate }</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>