<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
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
        input[type=text], textarea { width:100%; }
    </style>
</head>
<body>

<%
request.setCharacterEncoding("utf-8");
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
//String num = request.getParameter("num");
String writer = request.getParameter("writer");
String title = request.getParameter("title");
String content = request.getParameter("content");
//String curTime = LocalDate.now() + " ";




try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
    stmt = conn.createStatement();
    String sql = String.format("insert into board(num,writer,title,content,regtime,hits) values(board_seq.nextval,'%s','%s','%s',sysdate,0)",writer,title,content);
    stmt.executeUpdate(sql); 
    		
    //int ret = stmt.executeUpdate("insert into board(title,writer,content,regtime,hits) values('"+title+"','"+writer+"','"+content+"','"+curTime+"',0)" );
    //if(ret == 1){
    	//out.println("입력에 성공!");
    //}
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
response.sendRedirect("boardList.jsp");
%>

</body>
</html>