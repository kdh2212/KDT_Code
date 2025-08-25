package dp.decorator;

public class Main2 {

	public static void main(String[] args) {
		ExeTimeCalculator call1 = new ExeTimeCalculator(new ImpleCalculator());
		System.out.println(call1.factorial(5));
		
		System.out.println("-------------------------------------------------");
		
		ExeTimeCalculator call2 = new ExeTimeCalculator(new ReCalculator());
		System.out.println(call2.factorial(5));
		

	}

}
