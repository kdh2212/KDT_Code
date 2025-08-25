package sec01.exam01;

public class gugudan_ex1 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
		 for(int j= 1; j<=9; j++) {
			//System.out.printf("%d단\t", i);
				System.out.printf("%d X %d = %d\t", i,j,i*j);
		}
		 if (i ==5) {
			 break;
		 }
			System.out.println();
		  
		}
	}

}
