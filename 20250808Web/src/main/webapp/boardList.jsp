<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*" %>
<%@ include  file="navbar.jspf"%>
<h2>게시판</h2>
<table>
 <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="writer" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th                >조회수  </th>
    </tr>
<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/du08", "root", "1234");
    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM board");
    while (rs.next()) {
    	String num = rs.getString("num");
    	String title = rs.getString("title");
        
        
%>
<tr>

		<td><%=rs.getString("num") %></td>
		 
		<td style="text-align:left;"><a href="boardUpdate.jsp?num=<%=num %>"><%=title %></a></td>
    	<td><%=rs.getString("writer") %></td>
    	<td><%=rs.getString("regtime") %></td>
    	<td><%=rs.getString("hits") %></td>
    	
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
<!-- 여기 삭제 -->
 

</table>
<br>
<input type="button" value="글쓰기" onclick="location.href='boardWrite.jsp'">

</body>
</html>