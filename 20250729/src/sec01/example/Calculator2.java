package sec01.example;

public class Calculator2 {
	
	void method() {}
	int method(int x) {return 0;}
	
	
	//필드
		int x; 
		int y;
		
		
		public Calculator2() {}
		
		public int getX() {
			return x;
		}
		
		
		public int getY() {
			return y;
		}
		
	
		
		public void setX(int x) {
			if(x < 0) {
				this.x = -x;
				return;
			}
			this.x = x;
		}


		public void setY(int y) {
			this.y = y;
		}


		//생성자
		public Calculator2(int x, int y) {
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
		
		//메소드
		void execute() {
			double result = avg(x,y);
			println("실행결과:" + result);
			
			
		}
		

		
		
		void println(String message) {
			System.out.println(message);
		}

	

}
