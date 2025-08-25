package thread;

import java.util.stream.IntStream;

public class ThreadEx6 {

	public static void main(String[] args) {
		Thread th = new Thread(() -> {
 
				IntStream.rangeClosed(1, 5).forEach((i)->{
					System.out.println("띵"); // 0.5초 지연 500ms
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				
		});
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


