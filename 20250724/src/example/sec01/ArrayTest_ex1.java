package example.sec01;

public class ArrayTest_ex1 {

	public static void main(String[] args) {
		int[] arr = new int[3]; // 초기화 된 값이 들어간다.
		String names[] = new String[5];
		int[] arr2 = new int[] {100,200,300};
		int[] arr3 = {400,500,600}; // 이러한 방법으로 초기화
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(names[i]);
			System.out.println(arr[i]);
			System.out.println(arr2[i]);
			System.out.println(arr3[i]);
		}

	}

}
