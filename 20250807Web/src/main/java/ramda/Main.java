package ramda;

public class Main {

	public static void main(String[] args) {

//		MyFunctionalInterface fi = ()-> System.out.println("method()"); // 한줄이면 이것도 가능			
//		 fi.method();
		
		MyFunctionalInterface fi3 = (x,y) -> {
			
			return x + y;
		};
		
		String str = fi3.method(100, "홍길동");
		System.out.println(str);

	}

}
