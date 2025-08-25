package example.sec05;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열길이: "); 
		int count = Integer.parseInt(sc.nextLine());
		
		int score[] = new int[count];
		int sum = 0;
		double avg;
		
		
	
		for(int i=0; i< score.length; i++) {
			System.out.printf("%d 점수>",i);
			score[i] = Integer.parseInt(sc.nextLine());
			sum += score[i];
		}
		
		avg = sum / (double) score.length;
		System.out.println("배열의 길이:" + count);
		System.out.printf("총점 : %d, 평균 : %3f\n ", sum, avg);
		

	}

}
