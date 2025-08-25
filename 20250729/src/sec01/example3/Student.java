package sec01.example3;

public class Student extends People{
	public int studentNum;

	public Student(String name, String ssn, int studentNum) {
//		this.studentNum = studentNum; //부모가 생성되기 전에는 할 수 없다.
		/*
		 * 부모에 생성자를 만들면 왜 오류가 날까? super()오류
		 * 부모 생성자에 필요한 값을 넣어주어야 한다. 
		 * 
		 */
		super(name,ssn);  // 부모 생성자를 호출
		        
		this.studentNum = studentNum; 
	}
	 //메소드 재정의
//	void method1() {
//		System.out.println("Student");
//	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println(name + "Student"); // 부모인 name
	}
	
	
	
}
