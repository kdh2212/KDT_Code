package sec01.exam01;
import java.util.Scanner;

public class Quiz_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		
		switch(num/10) {
		case  100:
			System.out.println("A");
		}
	}

}
