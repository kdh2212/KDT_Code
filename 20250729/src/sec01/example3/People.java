package sec01.example3;

public class People {
	// 필드
	public String name;
	public String ssn;
	
	
	public People(String name, String ssn) {
//		super(); // 상속받는게 없으니 지워두 된다.
		this.name = name;
		this.ssn = ssn;
	}
	
	void method1() {
		System.out.println("People");
	}
	

}
