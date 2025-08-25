package example.sec01;

public class Ex002 {

	public static void main(String[] args) {
		char var1 = 'A';
		System.out.println(var1);
		
		int var2 = 'B';
		System.out.println(var2);
		
		char var3 = '\uac00';
		System.out.println(var3);
		
		String str = "우리는 \" 개발자 \" 입니다.";
		System.out.println(str);
		
		boolean bol = true;
		System.out.println(bol);
		
		int x1 = 10;
		int x2 = 010;
		int x3 = 0x10;
		int x4 = (int)10e2; // e 는 실수만 가능한데 강제 형변환을 통해 정수에서 사용가능하게 만들었다.
		
		double x6 = 10e2;
		float x5 = 10e3F;
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);

		if(true) {
			int v1 = 100;
			System.out.println(v1); 
		}

	}

}
