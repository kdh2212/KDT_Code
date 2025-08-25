package sec02.exam06;


class Parent{}
class Child extends Parent{}


public class Ex {

	// 매개 변수 다형성
	//static을 붙인 이유 -> 객체생성을 하지않고 메소드를 쓰기 위해
	public static void method1(Parent parent) { 
		if(parent instanceof Child) {
			Child child = (Child) parent; // 강제 형변환
			System.out.println("method1-형 변환 성공!");
		}else {
			System.out.println("method1-형 변환 실패!");
		}
	}
	public static void method2(Parent parent) { 
		Child child = (Child) parent; // 강제 형변환
		System.out.println("method2-형 변환 성공!");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		
		Parent parentB = new Parent();
//		method2(parentB); // 부모
		method2(parentA);
		method1(parentA);

	}

}
