package sec01.example;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값입력>");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("값입력>");
		int y = Integer.parseInt(sc.nextLine());
		
		
		
		Calculator myCalc = new Calculator(7,10);
		myCalc.execute(x,y);

	}

}
