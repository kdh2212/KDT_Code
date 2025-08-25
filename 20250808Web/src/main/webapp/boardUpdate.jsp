<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*" %>
<!DOCTYPE html>
<html>	
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>
<table>

<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
String num = request.getParameter("num");
String writer = "";
String title = "";
String content ="";
String regtime = "";
String hits = "";
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/du08", "root", "1234");
    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM board where num = " + num);
    while (rs.next()) {
        title = rs.getString("title");
        writer = rs.getString("writer");
        regtime = rs.getString("regtime");
        hits = rs.getString("hits");
        content = rs.getString("content");
%>
	<tr>
        <th>제목</th>
        <td><%=title %></td>
    </tr>
    <tr>
        <th>작성자</th>
        <td><%=writer %></td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td><%=regtime %></td>
    </tr>
    <tr>
        <th>조회수</th>
        <td><%=hits %></td>
    </tr>
    <tr>
        <th>내용</th>
        <td><%=content %></td>
    </tr>
<% 
    }
} catch (SQLException e) {
    out.println("데이터베이스 오류: " + e.getMessage());
} catch (ClassNotFoundException e) {
    out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
} finally {
    try {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
    }
}
%>




</table>

<br>
<input type="button" value="목록보기" onclick="location.href='boardList.jsp'">
<input type="button" value="수정"
       onclick="location.href='boardUpdateWrite.jsp?num=<%=num%>'">
<input type="button" value="삭제"
       onclick="location.href='boardDelete.jsp?num=<%=num%>'">

</body>
</html>
