package se01.ex;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "김자바";
		String str2 = "김자바";
		
		String str3 = new String("김자바");
		String str4 = new String("김자바");
		
		String str5 = null;
		String str6 = null;
	
		if(str1 == str2) {
			System.out.println("str1 과 str2 는 참조가 같음");
		}else {
			System.out.println("str1 과 str2는 참조가 다름");
		}
		
		if(str3 == str4) {
			System.out.println("str3 과 str4 는 참조가 같음");
		}else {
			System.out.println("str3 과 str4는 참조가 다름");
		}
		
		

		if(str5 != null && str1.equals(str6)) {
			System.out.println("str1 과 str2 는 참조가 같음");
		}else {
			System.out.println("str1 과 str2는 참조가 다름");
		}
		

	}

}
