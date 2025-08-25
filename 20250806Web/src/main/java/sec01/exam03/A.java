package sec01.exam03;

public class A {
	// 인스턴스 멤버 ,메소드
	int field1;
	void method1() {}
	
	// 정적 멤버 ,메소드
	static int field2;
	static void method2() {}
	
	// 중첩 클래스
	class B{
		void method() {
			field1 = 10;
			method1();
			field2 = 20;
			method2();
		}
	}
	// static이 붙은 중첩 클래스
	static class C{
		void method2() {
			A a1 = new A();
			a1.field1 = 50;
//			field1 = 30; // 클래스 C에 static이 붙어서 static으로 정의 하지 않는 field1은 오류
//			method1();// 클래스 C에 static이 붙어서 static으로 정의 하지 않는 method1은 오류
			field2 = 40;
			method2();
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
