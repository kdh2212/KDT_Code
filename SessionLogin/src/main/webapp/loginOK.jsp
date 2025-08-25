<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${sessionScope.userId }</p>
<p>${sessionScope.userName }</p>
<h2>${sessionScope.userName }님 로그인</h2>
<form action="logout" method="post">

	<%=(String)session.getAttribute("userId")%>님 로그인
	
	<input type="submit" value="로그아웃">
</form>
</body>
</html>