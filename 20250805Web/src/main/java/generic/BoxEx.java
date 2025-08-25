package generic;

class Apple{}

public class BoxEx {

	
	public static void main(String[] args) {

		Box<String> box = new Box<String>(); // <T> 안에 쓰고 싶은 타입을 쓸수 있다. 
		box.set("홍길동");       // 자동 타입 변환
//		String name = (String) box.get(); // 강제 타입 변환을 해주어야 한다.
		String name = box.get(); // 강제 타입 변환을 안 할 수 있다.
		System.out.println(name);
		
		Box<Apple> box2= new Box<Apple>();
		box2.set(new Apple());
		Apple apple = box2.get();
		
	}

}
