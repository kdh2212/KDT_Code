package thread;

public class BeepTask2 extends Thread{

	@Override // source를 눌르소 override을 눌른후 run을 선택해서 생성한다.
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
