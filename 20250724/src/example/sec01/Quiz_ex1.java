package example.sec01;

import java.util.Scanner;

public class Quiz_ex1 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 잔고
		Scanner sc = new Scanner(System.in);
		int selectData = 0;
		int money = 0;
	
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 |3.잔고 |4.종료");
			System.out.println("---------------------------\n");
			System.out.print("선택>");
			selectData = Integer.parseInt(sc.nextLine());
			
			if(selectData == 1) {
				System.out.print("예금액> ");
				money = Integer.parseInt(sc.nextLine());
				balance = balance + money;
			} else if(selectData == 2) {
				System.out.print("출금액> ");
				money = Integer.parseInt(sc.nextLine());
				balance = balance - money;
			} else if(selectData == 3) {
				System.out.println("잔고> " + balance);

			} else if(selectData == 4) {
				
				System.out.println("프로그램 종료");
				break;
				
			}
			
		}
	}

}
