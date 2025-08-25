package sec01.exam01;

/*
 *  NullPointExcception
 */

class AnyClass {
	void method1() {}
}
public class NPEEx {

	public static void main(String[] args) {
		
		AnyClass anyClass = null; // 인스턴스도 안만들어졌는데 메소드를 호출해서 오류
		anyClass.method1();
		
//		String data = null;
//		System.out.println(data.toString());

	}

}
