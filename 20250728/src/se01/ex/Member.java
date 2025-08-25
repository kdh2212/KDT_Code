package se01.ex;
/*
 * 생성자 오버로딩
 */
public class Member {
	String name;
	String phone;
	String address;
	int sal;
	
	
	Member(){
		this("사용자","010-1111-1111","성남",50); // defalult
	}// 기본생성자
		
	public Member(String name, String phone) {
		this(name,phone,"서울",100);
		
	}
	
	
	public Member(String name, String phone, String address) {
		this(name,phone,address,500);
	}

	
	public Member(String name, String phone, String address, int sal) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sal = sal;
		System.out.println("생성완료!");
	}

	
	public static void main(String[] args) {
		Member member = new Member(); // 기본 생성자 호출 
		
	}

}
