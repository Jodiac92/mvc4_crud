<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
window.onload = function() {
	document.getElementById("btnUpdateOk").onclick = function(){
		//....
		f.action= "update.m2";
		f.submit();
	}
	document.getElementById("btnListOk").onclick = function(){
		f.action= "list.m2";
		f.submit();
	}
}
</script>
</head>
<body>
<%@ include file="logincheck.jsp" %>
**사용자수정**<br>
<form name="f" method="post">
<input type="hidden" name="userid" value="${user.userid}">
아이디 : ${user.userid} <br>
비밀번호 : <input type="text" name="password" value="${user.password}"><br>
작성자 : <input type="text" name="name" value="${user.name}"><br>
이메일 : <input type="text" name="email" value="${user.email}"><br>
<br>
<input type="button" value="수정" id="btnUpdateOk">
<input type="button" value="목록" id="btnListOk">
</form>
</body>
</html>