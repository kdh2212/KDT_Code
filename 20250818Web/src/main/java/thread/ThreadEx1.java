package thread;

class Task2 extends Thread {

	@Override
	public void run() {
		for (int i=0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Task1 implements Runnable {
	
	public void run() {
		for (int i=0; i < 5; i++) {
			System.out.println("삐");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadEx1 {

	public static void main(String[] args) {
//		Thread th = new Thread(new Task1());
//		th.start();
//		Thread th1 = new Task2();
//		th1.start();
		Thread th2 = new Thread() {
			
		
			public void run() {
				for (int i=0; i<5; i++) {
					System.out.println("삐");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		th2.start();
		
		for (int i=0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
