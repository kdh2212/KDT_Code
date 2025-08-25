package sec01.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Quiz_jdbc_ex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{	
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3305/spring5fs";
		Connection con = null;
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("클래스 있다.");
		
		
		con = DriverManager.getConnection(url,id,pw);
		System.out.println("접속 성공!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("sql문 입력>");
		String sql = sc.nextLine();
		
		Statement stmt = con.createStatement(); // 쿼리문 실행결과를 stmt에다가 줬다.
		ResultSet rs = stmt.executeQuery(sql);
		if(sql.equals("select * from emp;")) {
			System.out.println("사번\t이름\t직무");
			System.out.println("-----------------------------------------------");
		}else {
			System.out.println("DEPTNO\tDNAME\t\tLOC");
			System.out.println("-------------------------------------------");
		}
		while(rs.next()) {
			if(sql.equals("select * from emp;")) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String ejob = rs.getString("job");
				System.out.printf("%d\t%s\t%s\n",empno,ename, ejob);
			}else {
				String str1 = rs.getString(1); // 컬럼이 무엇인지 모를때
				String str2 = rs.getString(2);
				String str3 = rs.getString(3);
				System.out.printf("%s\t%-10s\t%s\n",str1,str2,str3);
			}
		}
		// close()를 잘 사용하자.
		rs.close();
		stmt.close();
		con.close();

	}

}
