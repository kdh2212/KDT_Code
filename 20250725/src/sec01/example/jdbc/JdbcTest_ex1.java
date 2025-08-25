package sec01.example.jdbc;

public class JdbcTest_ex1 {

	public static void main(String[] args) {
//		Class.forName("com.mysql.cj.jdbc.Driver"); 
	
		try { // 원칙은 이렇게 해야한다.
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			System.out.println("클래스 있다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 없다.");
		}

	}

}
