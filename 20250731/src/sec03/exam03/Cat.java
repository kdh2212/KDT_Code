package sec03.exam03;

public class Cat implements Animal{

	public String kind;
	public Cat() {
		this.kind = "포유류";
	}
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	

}
