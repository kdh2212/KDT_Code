package sec02.check01;

public class SnowTireExample {

	public static void main(String[] args) {
		Tire tire1 = new SnowTire();
		if(tire1 instanceof SnowTire) {
			SnowTire snowTire1 = (SnowTire) tire1;
			System.out.println("클래스 타입 변환됨");
			
		}else {
			System.out.println("클래스 타입 변환 안됨");
		}
		
		
		
		
		SnowTire snowTire = new SnowTire();
//		Tire snowTire2 = new SnowTire(); // 가능하다.
//		SnowTire snowTire3 = new Tire(); // 이건 불가능
//		SnowTire snowTire4 = (SnowTire)new Tire(); // 가능은하지만 하지 않는게 좋다.
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();

	}

}
