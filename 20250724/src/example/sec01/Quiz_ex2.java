package example.sec01;

import java.util.Scanner;
/*
 * if 문 
 */

public class Quiz_ex2 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("-------------------------------------------------------\n");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];// 추가 부분
				
			}else if(selectNo == 2) {
				for(int i=0; i< studentNum; i++) {
					System.out.printf("scores[%d]>\n",i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				
			}else if(selectNo == 3) {
				for(int i=0; i< scores.length; i++) {
					System.out.printf("scores[%d]> %d\n",i,scores[i]);
				}
				
			}else if(selectNo == 4) {
				for(int i=0; i< scores.length; i++) {
					sum = sum + scores[i];
					max = (max < scores[i]) ? scores[i] : max; // 추가 삼항 연산자
				}
				
				avg = (double)sum / scores.length;
				System.out.println("최고점수:" + max);
				System.out.println("평균점수:" + avg);
				
			}else if(selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");

	}

}
