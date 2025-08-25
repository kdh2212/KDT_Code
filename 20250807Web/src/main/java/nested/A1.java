package nested;

public class A1 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method3() {}

	class B{
		void method() {
			field1 = 10;
//			A1.this.method1();
			method1();
			
			field2 = 20;
		}
	}
	
	// static이 붙으면 
	static class C { 
		void method2() {
			field2 = 10;
			method3();
		}
		
	}
	
	class D{}
	
	public static void main(String[] args) {
//		B b1 = new B(); // 이렇게 할 수 없다.
//		B b1 = new A1.B(); // 도 안된다. 할려면 클래스에 static이 붙어야 한다.
		A1.B b1 = new A1().new B(); // 아니면 이렇게 가능
		
		C c1 = new A1.C();
		A1.C c2 = new A1.C();
		
		A1.D d1 = new A1().new D();
	}
}

