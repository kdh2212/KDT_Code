<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
회원가입 화면<br/>
아이디	:<input type="text" name="member_id"/><br/>
비밀번호	:<input type="text" name="member_pw" /><br/>
이름		:<input type="text" name="member_name" /><br/>
전화번호	: <input type="text" name="member_number" /><br/>
 이메일	:<input type="text" name="member_email" /><br/>
<input type="submit" value="확인"/>
</form>

<%
String member_id = request.getParameter("member_id");
String member_pw = request.getParameter("member_pw");
String member_name = request.getParameter("member_name");
String member_number = request.getParameter("member_number");
String member_email = request.getParameter("member_email");
String sql = "";
if("".equals(member_id) || member_id == null){
	sql = "SELECT * FROM member_0801";
} else {
	sql = "insert into member_0801(member_id,member_pw,member_name,member_number,member_email) values('%s','%s','%s','%s','%s')" + member_id + member_pw + member_name + member_number + member_email;
}
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/Member", "root", "1234");
    stmt = conn.createStatement();
    rs = stmt.executeQuery(sql);
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
<th>아이디</th><th>비밀번호</th><th>이름</th><th>전화번호</th><th>email</th>
</tr>
<% 
    while (rs.next()) {
%>
<tr>
<td><%=rs.getString("member_id") %></td>
<td><%=rs.getString("member_pw") %></td>
<td><%=rs.getString("member_name") %></td>
<td><%=rs.getString("member_number") %></td>
<td><%=rs.getString("member_email") %></td>
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