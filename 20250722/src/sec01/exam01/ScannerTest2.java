package sec01.exam01;
import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		String inputData = sc.nextLine();
		int z = Integer.parseInt(inputData);
		System.out.printf("%d\n", z);
		System.out.printf("%s", inputData);
//		if(z==0) {
//			System.out.println("0입니다.");
//		}
//		else if(z>0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}
		
	}

	
}
