package thread;

public class ThreadEx {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("삐"); // 0.5초 지연 500ms
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
