package sec01.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3305/DoItSQL";
		Connection con = null;
		Statement stmt =null;
		ResultSet rs = null;
		String sql = "select * from order0729";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver 이름 앞에는 패키지
			System.out.println("드라이버 로딩!");
			con = DriverManager.getConnection(url,id,pw);
			System.out.println("접속 성공!");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String orderId = rs.getString("order_id");
				String product = rs.getString("product");
				int quantity = rs.getInt("quantity"); // IntegerparsInt를 할 필요없이 getInt로 할 수 있다.
				
				System.out.println(orderId + "\t" + product + "\t" + quantity);
			}
			
			rs.close();
			stmt.close();
			con.close();
			
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("접속 안됨!");
		}
	
	}

}
