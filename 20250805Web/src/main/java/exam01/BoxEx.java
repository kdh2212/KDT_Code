package exam01;

class Apple{}

public class BoxEx {

	
	public static void main(String[] args) {
//		Object obj = "가나다";
//		Object obj1 = 100;
//		
		Box box = new Box();
		box.set("홍길동");       // 자동 타입 변환
		String name = (String) box.get(); // 강제 타입 변환을 해주어야 한다.
		System.out.println(name);
		
		
//		Box box2 = new Box();
//		box2.set(new Apple());  
//		Apple apple = (Apple) box2.get();
		

	}

}
