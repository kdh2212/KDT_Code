package se01.ex;

import java.lang.reflect.Method;
import java.util.Scanner;
/*
 * public class ScannerTest {
	
	void method(Scanner scan) {
		System.out.println("입력>");
		String str = scan.nextLine();
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
	}

}
Quiz: 입력을 통해 값이 나올수 있게 코드를 수정.
 */

public class ScannerTest {
	
//	static void method(Scanner scan) {
//		System.out.println("입력>");
//		String str = scan.nextLine();
//		System.out.println(str);
//	}
	
	
	
	void method(Scanner scan) {
		System.out.println("입력>");
		String str = scan.nextLine();
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		method(scan);
		ScannerTest sct = new ScannerTest();
		
		sct.method(scan);
	}

}
