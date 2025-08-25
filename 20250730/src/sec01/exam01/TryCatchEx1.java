package sec01.exam01;


// 일반 익셉션
public class TryCatchEx1 {

	public static void main(String[] args) {
		try {
			Class.forName("sdjasjdaksldj");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("언제나 실행!");
		}

	}

}
