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
//String str = "홍길동"; // 값
//request.setAttribute("hong", str); // hong은 넘어가는 키 정도로 생각

ArrayList<Student> list = new ArrayList<>();

Student stu = new Student("김하나","서울시","010-2232-1123");
//stu.name ->getter ,setter을 안쓸경우 name을 public으로 할경우
list.add(stu);
stu = new Student("김자바","산본","010-2331-3131");
list.add(stu);
request.setAttribute("list", list);
request.setAttribute("kim", stu);


%>
<jsp:forward page="to.jsp"/>
<h1>from.jsp</h1>
</body>
</html>