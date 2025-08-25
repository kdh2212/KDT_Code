package sec01.example2;

/*
 * 용도는  
 */
public class ShopeEx {

	public static void main(String[] args) {
//		ShopService service = new ShopService();
//		ShopService service = ShopeService.s; 이렇게도 사용을 못하게 하기 위해 private 을 붙인거다.
		ShopService service = ShopService.getInstance();
		
		

	}

}
