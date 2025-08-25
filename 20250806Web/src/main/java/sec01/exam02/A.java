package sec01.exam02;

public class A {
	class B{}
	static class C{}
	
	B field1 = new B();
	C field2 = new C();
	
//	static B field3 = new B(); // 이건 안된다.
	static B field5 = new A().new B(); // 이건 된다. static으로 쓰일라면 A도 생성해주어야 한다.
	static C field4 = new C();
	
	void method1() {
		B v1 = new B();
		C v2 = new C();
	}
	
	static void method2() {
//		B v1 = new B(); // 에러
		B v3 = new A().new B(); //static으로 쓰일라면 A도 생성해주어야 한다.
		C v2 = new C();
	}
}
