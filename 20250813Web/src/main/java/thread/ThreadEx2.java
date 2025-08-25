package thread;

public class ThreadEx2 {
	public static void main(String[] args) { // 메인 스레드
		
		Thread th = new Thread(new BeepTask());
		th.start(); // 새로운 스레드 시작
		
		for(int i=0; i<5; i++) {
			System.out.println("삐"); // 0.5초 지연 500ms
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
