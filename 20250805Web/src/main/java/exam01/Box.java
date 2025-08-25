package exam01;

public class Box {
	private Object object; // object 클래스는 모든 클래스의 조상 
	
	public void set(Object object) { // setter 필드의 값을 세팅 
		this.object = object;
	}
	
	public Object get() { // getter // 필드의 값을 가져오는 것
		return object;
	}

}
