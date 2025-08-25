package sec01.exam011;

public class A {
	A(){
		System.out.println("A 생성자");
	}
	static class B{
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

		A.B b2= new A.B(); // class B 가 static일때 
		b2.method1();
		A.B.method2();
		
		
	}
}
