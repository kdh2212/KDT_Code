package sec01.example;

import java.util.Scanner;

public class CalculatorExample2 {
	static int x= 100;

	public static void main(String[] args) {
		
		Calculator2 calculator = new Calculator2();
		calculator.setX(7);
		calculator.setY(10);
		calculator.execute();
	}

}
