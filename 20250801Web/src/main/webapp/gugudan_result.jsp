<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int result = 0;
int num1 = Integer.parseInt(request.getParameter("num"));
%>
<%=num1 %>단<br/>
<% 
for(int i= 1; i< 10; i++){
	result = num1 * i;
	
%>
<%=num1 %> * <%=i %> = <%=result %><br/>
<!--<%=result %><br/>  -->
<% 
}
%> 
</body>
</html>