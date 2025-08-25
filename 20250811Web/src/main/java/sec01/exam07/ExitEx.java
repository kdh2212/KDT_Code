package sec01.exam07;

public class ExitEx {

	public static void main(String[] args) {
		
		for(int i=0; i< 10; i++) {
			if(i==5) {
				System.exit(0); // 0 은 정상 종료
			}
		}
		System.out.println("종료");
	}

}
