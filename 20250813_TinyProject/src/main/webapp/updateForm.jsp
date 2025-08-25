<%@page import="java.util.List"%>
<%@page import="dto.TinyDTO"%>
<%@page import="dao.TinyDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
//String content = request.getParameter("content");

TinyDAO dao = new TinyDAO();
TinyDTO dto = dao.selectOne(Integer.parseInt(num)); // num으로 해당 항목 조회

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update.jsp">
<input type="hidden" name="num" value="<%=num %>" />
<input type = "text" name = "content" value="<%=dto.getContent() %>" />
<input type = "submit" value = "수정"/>
<button type = "button" onclick="location.href='deleteForm.jsp'"> 삭제 </button>
</form>
</body>
</html>