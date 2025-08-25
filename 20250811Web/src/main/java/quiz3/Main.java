package quiz3;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("1234","홍길동");
		Student s2 = new Student("1234","홍길동");
		
		if(s1.equals(s2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}

	}

}
