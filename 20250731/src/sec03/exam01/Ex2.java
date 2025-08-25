package sec03.exam01;


//객체  생성 안됨 추상 클래스와 비슷
//abstract 를 생략해도 추상 메소드이다.
interface AA{ 
//	abstract void method1();  
	 void method();
}

//메소드에 abstract가 붙어있으면 강제적으로 재정의를 해야한다.
//장점 다중 상속이 가능하다.
class BB implements AA{ 

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	} 
	
}


public class Ex2 {

	public static void main(String[] args) {
		AA a = new BB();

	}

}
