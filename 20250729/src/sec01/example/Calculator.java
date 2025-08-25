package sec01.example;
/*
 * 단점은?
 * avg(7,10); 값을 넣었다는 것이다.
 * 
 * 장점?
 * 자기 메소드를 잘 사용하고 있다.
 * 
 */
public class Calculator {
	int x;
	int y;
	//필드
	//생성자
	//메소드
	
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	

	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum /2;
		return result;
	}
	
//	void execute() {
//		double result = avg(x,y);
//		println("실행결과:" + result);
//		
//		
//	}
	

	double execute(int x, int y) {
		double result = avg(x,y);
		println("실행결과:" + result);
		return result;
		
		
	}
	
	
	void println(String message) {
		System.out.println(message);
	}

}
