package nested;

public class A {
	class B{} //인스턴스 멤버 클래스
	static class C{} // 정적 멤버 클래스
	void method() {
		class D{} // 로컬 클래스
		D d1 = new D();
	}
	public static void main(String[] args) {
//		A a1 = new A();
//		B b = a1.new B(); // A가 객체가 생성되고 생성할 수 있다.
		B b1 = new A().new B();
		
		A.C c1 = new A.C();
	}
}
