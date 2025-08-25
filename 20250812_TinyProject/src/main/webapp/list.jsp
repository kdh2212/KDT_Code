<%@page import="dto.TinyDTO"%>
<%@page import="java.util.List"%>
<%@page import="dao.TinyDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
TinyDAO dao = new TinyDAO();
List<TinyDTO> list = dao.selectlist();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
border: 1px solid #ccc;
border-collapse: collapse;
}
th, td {padding: 10px 20px;}
</style>
</head>
<body>
<table>
<%
for(TinyDTO dto : list){
%>
	<tr>
	<td style="text-align:left;"><a href = "updateForm.jsp?num=<%=dto.getNum() %>"><%=dto.getNum() %></a></td><td><%=dto.getContent() %></td>
	</tr>

<%
}
%>
</table>

<button type = "button" onclick="location.href='insertForm.jsp'"> 글쓰기 </button>
</body>
</html>