package sec01.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/*
 *   throws ClassNotFoundException, SQLException를 통해 다른방식의 예외처리 하지만 사용 x
 *   
 */ 
public class JdbcTest_ex1_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3305/spring5fs";
		Connection con = null;
		String sql = "select * from emp";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("클래스 있다.");
		
		
		con = DriverManager.getConnection(url,id,pw);
		System.out.println("접속 성공!");
		
		Statement stmt = con.createStatement(); // 쿼리문 실행결과를 stmt에다가 줬다.
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("사번\t이름\t직무");
		System.out.println("-----------------------------");
		
		while(rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String ejob = rs.getString("job");
			String str = rs.getString(5);
			System.out.printf("%d\t%s\t%s\t\t%s\n",empno,ename, ejob,str);

			
		}
		// close()를 잘 사용하자.
		rs.close();
		stmt.close();
		con.close();
	}

}
