package sec01.example3;

/*
 * 상속
 */
public class StuEx {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동", "1233322",1234); // 생성자가 있을경우 값을 넣어주어야 한다.
		
		stu.method1(); 
		
//		stu.name = "홍길동";
//		stu.ssn = "123322";
//		
//		stu.studentNum = 22123;
	}

}
