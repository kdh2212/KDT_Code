package sec01.example2;

public class ShopService {

	/* 
	 * private 을 사용한다는
	 * static을 사용하는 것은 객체를 생성하지 않아도 s를 사용할 수 있게
	 */
	private static ShopService s = new ShopService(); // 객체 생성을 다른곳에서는 못하게 하고. 접근을 하게 할려고 static 
	
	private ShopService() {} // 외부에서 객체 생성을 하지 못한다.
	
	public static ShopService getInstance() { // 정적인 메소드를 만들어주어야 한다. 왜? 객체생성을 못하니깐
		return s;
	}
	
	
	

}
