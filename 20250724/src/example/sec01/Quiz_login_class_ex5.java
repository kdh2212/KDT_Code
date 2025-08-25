package example.sec01;

import java.util.Scanner;
/*
 * 
 */

class BankAccount{
	private String name;
	private String account; 
	private int balance; 
	private int money = 0;
	
	public BankAccount(String name, String account, int balance) { // 생성자 대부분 이렇게 사용.
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	void deposit(int money) {// 입금 기능
//		this.balance += this.balance;
		this.balance = this.balance + this.money;
	}
	void withdraw(int money) { // 출금 기능
		this.balance = this.balance - this.money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

public class Quiz_login_class_ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount bankAc = new BankAccount("홍길동","H1234",0);// 객체 생성
//		String name = "홍길동";
//		String account = "H1234";
//		int balance = 0; // 잔고
		int money = 0;
 		boolean run = true;
		boolean login = false;
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
					
					if(str.equals(bankAc.getName()) && paw.equals(bankAc.getAccount())) {
							System.out.println("로그인 성공");
							login = true;
						
					} else {
						System.out.println("로그인 실패\n");
						login = false;
					}
				}else if(selectAccount == 2){
					System.out.print("이름 입력:");
//					bankAc.name = sc.nextLine();
					bankAc.setName(sc.nextLine());
					System.out.println("계정 입력:");
//					bankAc.account = sc.nextLine();
					bankAc.setAccount(sc.nextLine());
					
					
				}else if(selectAccount == 3) {
					System.out.println("프로그램 종료");
					run = false;
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
					bankAc.setMoney(money);
					bankAc.deposit(bankAc.getMoney());
				} else if(selectData == 2) {
					System.out.print("출금액> ");
					money = Integer.parseInt(sc.nextLine());
					bankAc.setMoney(money);
					bankAc.withdraw(bankAc.getMoney());
					
				} else if(selectData == 3) {
					System.out.println("잔고> " + bankAc.getBalance());

				} else if(selectData == 4) {
					
					System.out.println("프로그램 종료");
					break;
					
				}
			}
			
		}

	}

}
