package sec01.exam01;

// 런타임 익셉션
public class TryCatchEx2 {

	public static void main(String[] args) {
		String[] arr = {"홍길동","김자바"};
		String str = null;
		
		try {
			Integer.parseInt("10");
			System.out.println(arr[1]);
			System.out.println(str.toString());
		} catch(NumberFormatException  | ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
