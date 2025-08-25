<%@page import="java.util.ArrayList"%>
<%@page import="study.Student"%>
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
ArrayList<Student> list = (ArrayList<Student>) request.getAttribute("list");
for(Student stu : list){
	out.println(stu.getName());
}
//String str = (String) request.getAttribute("hong");
Student stu = (Student) request.getAttribute("kim");
//out.println(stu.getName());

%>

<h2>${stu.name}</h2>
<h2>${stu.addr}</h2>
<h2>${stu.phone}</h2>
</body>
</html>