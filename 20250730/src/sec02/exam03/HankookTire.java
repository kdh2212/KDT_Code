package sec02.exam03;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRoatation) {
		super(location, maxRoatation);
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRoatation) {
			System.out.println(location + "HankookTire 수명:" + (maxRoatation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 펑크***");
			return false;
		}
	
	
	}

}
