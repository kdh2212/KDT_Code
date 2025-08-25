package example.sec01;

import java.util.Scanner;
/*
 * switch case 문을 활용 
 */

public class Quiz1_login_ex3 {

	public static void main(String[] args) {

		String name = "홍길동";
		String account = "H1234";
		boolean run = true;
		boolean login = false;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			if (!login) {
				System.out.println("--------------------------------------");
				System.out.println("로그인");
				System.out.println("--------------------------------------");
				System.out.print("이름>");
				String str1 = scanner.nextLine();
				System.out.print("계정>");
				String str2 = scanner.nextLine();
				if (str1.equals(name) && str2.equals(account)) {
					System.out.println("로그인 성공");
					login = true;
				} else {
					System.out.println("로그인 실패");
				}
			}
			
			
			if (login) {
				System.out.println("--------------------------------------");
				System.out.println("1.예금   | 2. 출금   | 3. 잔고   | 4.로그아웃");
				System.out.println("--------------------------------------");
				System.out.print("선택>");
				int num = Integer.parseInt(scanner.nextLine());
				switch (num) {
				case 1:
					System.out.print("예금액>");
					num = Integer.parseInt(scanner.nextLine());
					balance += num;
					break;
				case 2:
					System.out.print("출금액>");
					num = Integer.parseInt(scanner.nextLine());
					balance -= num;
					break;
				case 3:
					System.out.println("잔고>"+balance);
					break;
				case 4:
					run = false;
					break;
				}
			}
			
		}
		System.out.println("종료");

	}

}
