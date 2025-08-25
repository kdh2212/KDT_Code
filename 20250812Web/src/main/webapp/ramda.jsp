<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String str = "가나다";
request.setAttribute("aaa", str);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${aaa }<br/>
${greaterThen= (a,b)-> a > b ? true : false; '' }
${greaterThen(10,30) }

</body>
</html>