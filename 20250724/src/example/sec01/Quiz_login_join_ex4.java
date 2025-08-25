package example.sec01;

import java.util.Scanner;
/*
 * 회원가입 추가 그냥 변수를 초기화 해서 하는 방식으로 
 */

public class Quiz_login_join_ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "홍길동";
		String account = "H1234";
 		boolean run = true;
		boolean login = false;
		int balance = 0; // 잔고
		int money = 0;
		int selectData = 0;
		int selectAccount = 0;
		
		
	
		while(run) {
			if(login == false) {// !login도 가능하다. 
				System.out.println("----------------------------");
				System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
				System.out.println("----------------------------\n");
				System.out.print("선택>");
				selectAccount = Integer.parseInt(sc.nextLine());
				
				if(selectAccount == 1) {
					System.out.println("이름>");
					String str = sc.nextLine();
					System.out.println("계정>");
					String paw = sc.nextLine();
					
					if(str.equals(name) && paw.equals(account)) {
							System.out.println("로그인 성공");
							login = true;
						
					} else {
						System.out.println("로그인 실패\n");
						login = false;
					}
				}else if(selectAccount == 2){
					System.out.print("이름 입력:");
					name = sc.nextLine();
					System.out.println("계정 입력:");
					account = sc.nextLine();
					
					
				}else if(selectAccount == 3) {
					System.out.println("프로그램 종료");
					run = false;
					break;
				}
		}
			
			
			if (login== true) {
				System.out.println("----------------------------");
				System.out.println("1.예금 | 2.출금 |3.잔고 |4.종료");
				System.out.println("----------------------------\n");
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

}
