package thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		Thread th = new BeepTask2();
		th.start();
		
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
