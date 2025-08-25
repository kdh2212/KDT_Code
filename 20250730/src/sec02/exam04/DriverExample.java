package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 부모로 변수 설정 자식으로 객체 생성
//		Vehicle v1 = bus;
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
