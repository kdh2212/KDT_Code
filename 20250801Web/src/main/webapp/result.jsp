<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
int result = 0;
// String str = request.getParameter("val1");
int num1 = Integer.parseInt(request.getParameter("val1"));
int num2 = Integer.parseInt(request.getParameter("val2"));
//result = Integer.parseInt(str) * str2;
//result = num1 * num2;
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=num1 * num2 %>
</body>
</html>