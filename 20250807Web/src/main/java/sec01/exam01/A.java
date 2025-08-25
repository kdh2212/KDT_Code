package sec01.exam01;

class Parent{
	void method1() {}
}
class Child extends Parent{}

public class A {
//	Parent ff = new Child();
	Parent field1 = new Parent() { // 익명의 자식객체의 내용
		int childField; // 익명의 자식객체의 필드
		void childMethod() {}// 익명의 자식객체의 메소드
		@Override
		void method1() {// 익명의 자식객체의 재정의
			childField = 100; // 이렇게 접근이 가능
			childMethod();
		}
		
		
	};
	
	Parent field2 = new Parent() {};
	
	void method2() {
		field1.method1();
		Parent field3 = new Parent() {};
		
		method3(new Parent() {});
	}
	
	void method3(Parent parent) {}
	
}
