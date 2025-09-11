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
<h2>아이템 목록</h2>
<ul>
	<c:forEach var="item" items="${list }">
		<li>${item.email }, ${item.name }</li>
	</c:forEach>
</ul>
</body>
</html>