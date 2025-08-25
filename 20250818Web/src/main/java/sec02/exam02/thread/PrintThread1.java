package sec02.exam02.thread;

public class PrintThread1 extends Thread{
	private boolean stop; // false
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) { // !false -> 무한 실행 중 
			System.out.println("실행 중");
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
