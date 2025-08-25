
import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			String id="root";
			String pw="1234";
			String url="jdbc:mysql://localhost:3305/spring5fs"; //spring5fs 는 데이터베이스 명 
			// 포트 번호와 데이터베이스 명을 바꿔서 jdbc 해보기
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,id,pw);

			System.out.println("데이터베이스에 연결됐다");
		}
		catch(Exception e) {
			System.out.println("로딩실패");
		}

	}

}
