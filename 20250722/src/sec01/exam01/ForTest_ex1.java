package sec01.exam01;

public class ForTest_ex1 {
	public static void main(String[] args) {
		int sum =0;
//		for(int i=1; i<=10; i++) {
//			
//			sum = sum + i;
//		}
//		int i = 1;
//		while(i<=10) {
//			sum = sum+i;
//			i++;
//		}
		int i = 1;
		do {
			sum = sum + i;
			i++;
		}while(i <= 10);
		
		System.out.println("합계: "+sum);
	}

}
