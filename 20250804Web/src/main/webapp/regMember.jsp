<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*" %>
<%
request.setCharacterEncoding("utf-8");
String kname = request.getParameter("kname");
String addr = request.getParameter("addr");
String email = request.getParameter("email");
String phone = request.getParameter("phone");



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
String sql = String.format("insert into member(kname,addr, email, phone) values ('%s','%s','%s','%s')"
		,kname, addr, email, phone);

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/du08", "root", "1234");
    stmt = conn.createStatement();
    stmt.executeUpdate(sql);
    
    sql = "select * from member";
  	rs = stmt.executeQuery(sql); // rs에 대입을 해주어야지 테이블이 보여진다.
   
 
     
%>
<style type = "text/css">
table, th, td{
	border:1px solid #ccc;
	border-collapse:collapse;
}
th, td { padding:10px,20px;}
</style>
<table>
<tr>
<th>이름</th><th>주소</th><th>email</th><th>전화번호</th>
</tr>
<% 
    while (rs.next()) {
%>
<tr>
<td><%=rs.getString("kname") %></td>
<td><%=rs.getString("addr") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("phone") %></td>

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
</body>
</html>