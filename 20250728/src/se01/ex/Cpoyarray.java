package se01.ex;

public class Cpoyarray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = new int[4];
		int[] array2 = {1,5,3,8,2};
		int max = 0;
		int sum = 0;
		double avg= 0.0;
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for(int i=0; i < arr1.length; i++) { // 인덱스로 작업할때
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------------------");
		// 향상된 for문
		for(int i: arr2) { // 인덱스로 작업을 하지 않을때
			System.out.println(i);
		}
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		System.out.println("-----------------------------");
		System.out.println(array.length);
		System.out.println(array[2].length);
		System.out.println("-----------------------------");
		
		for(int i=0; i<array2.length; i++) {
//			max = (max < array2[i] ) ? array2[i] : max;
			if(max < array2[i]) {
				max = array2[i];
			}
		}
		System.out.println("-----------------------------");
		
		System.out.println(max);
		
		}
	}


