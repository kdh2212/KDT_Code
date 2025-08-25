package example.sec01;

public class ArrayTestMethod_ex2 {
	public static void method1(){
		System.out.println("mthod1");
	}
	public static int method2() {
		System.out.println("method2");
		return 100;
	}
	public static int method3(String name) {
		System.out.println("method3");
		return 300;
	}

	public static void main(String[] args) {
		method1();
		int x = method2();
		System.out.println("method2: "+ x);
		int y = method3("홍길동");
		System.out.println("method3: "+ y);
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
