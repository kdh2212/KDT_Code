package Project;

import java.util.Scanner;
/*
 * 개인 code
 */

public class Project_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean login = false;
		int studentNum = 0; // 임시 과목수
		int[] scores = null;
		String[] sub = null; // 과목명
		String[] grade = null; //성적
		int sum = 0;
		double avg = 0;
		int max = 0;
		int scoresIndex = 0;
		String maxsub;
		String name = "홍길동";
		String account = "1234";
		String str;
		String pwd;
		
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
			System.out.println("-------------------------------------------------------\n");
			System.out.print("선택>");
		
			int loginNum = Integer.parseInt(sc.nextLine());
			if(loginNum == 1) {
				System.out.print("이름>");
				str = sc.nextLine();
				System.out.print("계정>");
				pwd = sc.nextLine();
				if(str.equals(name) && pwd.equals(account)) {
					System.out.println("로그인이 성공했습니다.");
					login = true;
					break;
					
				}else {
					System.out.println("로그인이 실패");
				} 
				
			}else if(loginNum == 2){
					System.out.print("회원가입 진행\n");
					System.out.print("이름>");
					name = sc.nextLine();
					System.out.print("계정>");
					account = sc.nextLine();
				}else if(loginNum == 3){
					break;
				}
			}
		
		
		
		while(login) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------\n");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("과목수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];// 추가 부분
				sub = new String[studentNum];// 과목 
				grade = new String[studentNum];// 학점 
				
			}else if(selectNo == 2) {
				for(int i=0; i< studentNum; i++) {
				
					System.out.print("과목명>");
					sub[i] = sc.nextLine();
					
					System.out.print("점수>");
					scores[i] = Integer.parseInt(sc.nextLine());
					if(scores[i]>=95 && scores[i]<=100) {
						grade[i] = "A+";
					}else if(scores[i]>=85 && scores[i]<=90) {
						grade[i] = "A";
					}else if(scores[i]>=75 && scores[i]<=80) {
						grade[i] = "B+";
					}else if(scores[i]>=65 && scores[i]<=70) {
						grade[i] = "B";
					}else if(scores[i] <= 60) {
						grade[i] = "C";
					}
					

				}
				
			}else if(selectNo == 3) {
				for(int i=0; i< scores.length; i++) {	
					System.out.printf("%s>\t%d점\t학점:%s\n",sub[i],scores[i],grade[i]);
				}
				
			}else if(selectNo == 4) {
				for(int i=0; i< scores.length; i++) {
					sum = sum + scores[i];
//					max = (max < scores[i]) ? scores[i] : max; // 추가 삼항 연산자
					if(scores[i]>max) {
						max = scores[i];
						scoresIndex = i;
					}
				}
				maxsub = sub[scoresIndex];
				avg = (double)sum / scores.length;
				
				System.out.println("최고과목:" + maxsub);
				System.out.println("최고점수:" + max);
				System.out.println("평균점수:" + avg);
				
				if(avg>=95 && avg<=100) {
					System.out.println("학점:A+");
				}else if(avg>=85 && avg<=90) {
					System.out.println("학점:A");
				}else if(avg>=75 && avg<=80) {
					System.out.println("학점:B+");
				}else if(avg>=65 && avg<=70) {
					System.out.println("학점:B");
				}else if(avg <= 60) {
					System.out.println("학점:c");
				}
				sum = 0;// 추가부분 > 에러> 4번을 계속눌르니 평균점수가 계속올라감 그래서 추가함. 
				
			}else if(selectNo == 5) {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");


	}

}
