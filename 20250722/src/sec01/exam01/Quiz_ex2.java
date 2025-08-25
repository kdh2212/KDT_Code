package sec01.exam01;
import java.util.Scanner;

public class Quiz_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		
		String grade = "A";
		if(num>=90) {
			grade = "A";
		}else if(num >=80) {
			grade = "B";
		}else if(num >=70) {
			grade = "C";
		}else {
			grade = "F";
		}
		System.out.printf("%s", grade);
	
	}

}
