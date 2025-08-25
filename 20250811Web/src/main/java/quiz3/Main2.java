package quiz3;

public class Main2 {

	public static void main(String[] args) {
		Student2 s1 = new Student2("1234","홍길동");
		Student2 s2 = new Student2("1234","홍길동");
		
		if(s1.equals(s2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}

	}

}
