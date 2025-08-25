package example.sec05;

import java.util.Scanner;

public class ArrayTest1 {

	//Scanner, nextLine() 사용하여 점수를 입력받고 출력해 보세요.
	public static void main(String[] args) {
		
		int[] score =new int[3];
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("입력:" );
			//String str = sc.nextLine();
//			int inputData = Integer.parseInt(str);
			int inputData = Integer.parseInt(sc.nextLine());
			score[i] = inputData;
//			score[i] = Integer.parseInt(sc.nextLine());
			
			sum = sum + inputData;
			avg = sum / score.length;
			
//			System.out.println(score[i]);
		}
//		System.out.println(score.length);
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		
		for(int i =0; i<score.length; i++) {
			System.out.println("입력받은 값: "+score[i]);
		}

	}

}
