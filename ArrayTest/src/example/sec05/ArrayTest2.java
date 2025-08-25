package example.sec05;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] score =new int[3];
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("입력:" );
			int inputData = Integer.parseInt(sc.nextLine());
			score[i] = inputData;
			
			sum = sum + inputData;
			avg = sum / score.length;
			
//			System.out.println(score[i]);
		}
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		
		for(int i =0; i<score.length; i++) {
			System.out.printf("입력받은 값[%d]: %d\n",i,score[i]);
		}

	}

}
