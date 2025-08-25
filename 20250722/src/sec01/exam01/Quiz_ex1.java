package sec01.exam01;
import java.util.Scanner;

public class Quiz_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		if(num >= 90 && num <=100) {
			System.out.println("A");
		}else if(num >=80 && num <=89) {
			System.out.println("B");
		}else if(num >=70 && num <= 79) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		

	}

}
