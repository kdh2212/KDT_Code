package ramda;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Quiz1_1{

	public static void main(String[] args) {
		GeaterThan gt = new GeaterThan() {
			
			@Override
			public boolean result(int x, int y) {
				boolean result1 = (x > y) ? true : false;
				return result1;
				
			}
		};
	// 람다시 표현
		GeaterThan gt2 = (x,y)-> (x > y) ? true : false;
		GeaterThan gt3 = (x,y) -> {
				return ((x>y) ? true : false);
			
		};
		
		System.out.println(gt.result(50, 30));	
		System.out.println(gt2.result(10, 30));	
		System.out.println(gt3.result(30,40));
		
	}

}
