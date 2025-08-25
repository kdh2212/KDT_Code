package sec02.verify.exam03;

class A{}
class B extends A{}
class D extends B{}
class E extends B{}


public class Ex3 {

	public static void method(B b) {}
	public static void main(String[] args) {
//		method((B)new A());
		// 매개 변수 타형성
		method(new B());
		method(new D());
		
		// 이런 느낌이다
		B b1 = new D();
		method(b1); 
		
		method(new E());

	}

}
