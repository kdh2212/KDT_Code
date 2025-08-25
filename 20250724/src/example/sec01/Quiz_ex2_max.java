package example.sec01;

import java.util.Scanner;

public class Quiz_ex2_max {

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
			
			switch(selectNo) {
				case 1:
					System.out.print("학생수>");
					studentNum = Integer.parseInt(sc.nextLine());
					break;
					
					
				case 2:
					for(int i=0; i< studentNum; i++) {
						System.out.printf("scores[%d]>",i);
						scores[i] = Integer.parseInt(sc.nextLine());
					}
					break;
				case 3:
					for(int i=0; i< studentNum; i++) {
						System.out.printf("scores[%d]> %d",i,scores[i]);
					}
					break;
				case 4:
					for(int i=0; i< studentNum; i++) {
						sum = sum + scores[i];
						if(scores[i] > scores[i+1]) {
							max = scores[i];
						}else if(scores[i+1] > scores[i+2]) {
							max = scores[i+1];
						}else {
							max = scores[i+2];
						}
						
					}
					avg = sum / scores.length;
					System.out.println("최고점수:" + max);
					System.out.println("평균점수:" + avg);
					break;
				case 5:
					run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");


	}

}
