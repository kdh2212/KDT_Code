package sec01.exam01;

public class A {
	A(){
		System.out.println("A 생성자");
	}
	class B{
		B(){
			System.out.println("B 생성자");
		}
		
		int field;
		static int field2;
		void method1() {}
		static void method2() {
			System.out.println("method2");
		}

	}
	
	public static void main(String[] args) {
		A a1 = new A();
//		B b1 = a1.new B();
		A.B b2= a1.new B();
		b2.method1();
//		b2.method2();
		A.B.method2();
		
		
	}
}
