package chap11.exam01;

public class ObjectEx {
	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		
		System.out.println(object1 == object2);
		System.out.println(object1.equals(object2)); // 안되는 이유> 
		
		String str1 = new String("가나다");
		String str2 = new String("가나다");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "가나다";
		String str4 = "가나다";
		System.out.println(str1 == str2); // 이건 된다 리터럴로 잡아서 그런거다.
		System.out.println(str1.equals(str2));
	}

}
