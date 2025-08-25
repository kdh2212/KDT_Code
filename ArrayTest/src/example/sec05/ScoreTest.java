package example.sec05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수:");
		int score = Integer.parseInt(sc.nextLine());
		
		int[] stdscore= new int[score];
		String[] stdname = new String[score];
		int[] grade= new int[score];
		String[] point = new String[score];
		
	
		
		
		for(int i=0; i< score; i++) {
			System.out.print("학생 이름:");
			String student = sc.nextLine();
			System.out.print("점수 입력: ");
			int num = Integer.parseInt(sc.nextLine());
			stdname[i] = student; 
			grade[i] = num;
			
			switch(grade[i] /10) {
			case 10:
			case 9:
				point[i] = "A";
				break;
			case 8:
				point[i] = "B";
				
				break;
			case 7:
				point[i] = "C";
				break;
			default:
				point[i] = "D";
				break;
			}
			
		}
		for(int i=0; i<score; i++) {
			System.out.printf("학생이름: %s  점수 :%d  성적 : %s\n", stdname[i],grade[i],point[i]);
		}
	}

}
