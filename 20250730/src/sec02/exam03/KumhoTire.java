package sec02.exam03;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRoatation) {
		super(location, maxRoatation);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRoatation) {
			System.out.println(location + "KumhoTire 수명:" + (maxRoatation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire 펑크***");
			return false;
		}
	}
	
}
