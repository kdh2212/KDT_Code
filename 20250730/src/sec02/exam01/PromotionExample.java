package sec02.exam01;


// 부모가 생성자를 명시적으로 만들면 자식도 무조건 생성자를 만들어야 한다.
class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample {
	public static void main(String[] args) {
		// 클래스 A 를 객체 생성을 하지 않았다.
		// B가 객체 생성을 하면 A도 객체 생성을 한다.
		//객체 생성을 자식으로 할 수 있고, 부모로 변수 선언도 가능 (다형성)
		
		B b = new B();
		A a1 = b; 
	
		C c = new C();
		A a2 = c;
		
		
		
		A d1 = new D();
		B d2 = new D();
		D d = new D();
		A a3 = d;
		B b1 = d;
		
		
		E e = new E();
//		B e1 = e; // 오류 
		A e2 = e; // 가능
		
	}

}
