package chap11.exam01;

public class MemberEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// 메모리 번지가 다 다르다.
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode()); 
		System.out.println("------------------------------------------"); 
		//
		System.out.println(obj1.id.hashCode());
		System.out.println(obj2.id.hashCode());
		System.out.println("------------------------------------------"); 
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같다.");
			
		}else {
			System.out.println("obj1과 obj2는 다르다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 같다.");
			
		}else {
			System.out.println("obj1과 obj3는 다르다.");
		}
	}

}
