package sec01.example2;

public class Person {
	final String nation = "Korea"; // 메모리 공간에 한번만 사용이 가능 
	final String ssn;  // 그렇기 때문에 생성자를 사용하지 않았을때 에러
	String name;
	static final double PI = 3.141592; // 객체 생성과 상관없이 사용이 가능하다. static , 상수 
	
	
	
	
	
	// 생성자를 사용하면 값을 넣을때 final을 사용할 수 있다.
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	

}
