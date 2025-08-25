package thread;

public class ThreadA extends Thread{
	
	public ThreadA() {
		System.out.println("스레드 A");
	}
	

	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(this.getName() + "가 출력한 내용");
			 
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		
	}

	
}
