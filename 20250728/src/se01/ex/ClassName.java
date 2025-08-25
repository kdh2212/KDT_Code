package se01.ex;
/*
 * 예시 코드
 */

class ClassName2{
	int field1;
	void method1() {
		method2();
	}
	// 클래승 안에는 static 멤버들이 있을 수 있다.
	static int field2;
	static void method2() {
		
	}
}

public class ClassName {
//	int field1;
//	void method1() {
//		method2();
//	}
//	// 클래스 안에는 static 멤버들이 있을 수 있다.
//	static int field2;
//	static void method2() {
//		
//	}
	
	public static void main(String[] args) {
//		method1();
//		method2(); // static 끼리는 가능하다.
		ClassName2.method2();
		
		ClassName2 cn2 = new ClassName2();
		cn2.method1();
		cn2.method2();
		
		ClassName2 cn3 = new ClassName2();
		cn3.method1();
		
	}
}
