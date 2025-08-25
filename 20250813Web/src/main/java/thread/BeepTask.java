package thread;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("띵"); // 0.5초 지연 500ms
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		

	}

}
