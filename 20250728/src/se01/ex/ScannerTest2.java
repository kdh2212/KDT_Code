package se01.ex;

import java.util.Scanner;

public class ScannerTest2 {
	static String str;
	
	static void method(Scanner scan) {
		System.out.println("입력>");
		str = scan.nextLine();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ScannerTest2 sct = new ScannerTest2();
		
		sct.method(scan);
		System.out.println(sct.str);
	}

}
