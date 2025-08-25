package sec03.exam01;

/*
 * 추상 클래스
 * 추상클래스는 객체 생성 못함, 자식으로만 객체생성을 할 수 있게 했다.
 */

abstract class A{ 
	// 메소드에 abstract가 붙어있으면 상속받은 클래스가 강제적으로 재정의를 해야한다.
	// 시그니처 또한 같게 해야한다.
	// 구현이 안된다.
	abstract void method(String s); // 설계도// 추상 메소드 
	
}
class B extends A{

	@Override
	void method(String s) {}
}

public class Ex {

	public static void main(String[] args) {
//		A a = new A();  에러
		A a1 = new B(); // 이렇게는 가능
	}

}
