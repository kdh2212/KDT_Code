package dp.decorator;

public class ImpleCalculator implements Calculator{

	@Override
	public long factorial(long num) {
		long res = 1;
		for(long i=1; i <= num; i++) {
			res *= i;
		}
		return res;
	}

}
