package sec01.exam04;

public class B1Ex {

	public static void main(String[] args) {
		A1 a1; // 인터페이스 타입으로 변수를 선언할 수 있다.
		A1 a2 = new B1();
		a2.run();
//		a2.methodB1();// 자식으로 생성했의니 자식이 가지고 있는 메소드를 실행할 수 있는거 아니냐?  x
//		((B1) a2).methodB1(); // 강제로 타입 변환
		
		B1 b1 = (B1)a2; // 강제로 타입 변환
		b1.methodB1();

	}

}
