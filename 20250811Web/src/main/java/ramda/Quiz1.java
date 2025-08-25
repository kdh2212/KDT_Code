package ramda;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Quiz1 {

	public static void main(String[] args) {
		int x =10;
		int y = 5;
		
		if(x>y) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		// 인터페이스를  활용 3항 연산자
		GeaterThan gt = new GeaterThan() {
			
			@Override
			public boolean result(int x, int y) {
				boolean result1 = (x > y) ? true : false;
				return result1;
				
			}
		};
	
		
		FunctionalInterf2 fi = new FunctionalInterf2() {
			
			@Override
			public void anyMethod(int num,int num2) {
				boolean z = (x > y) ? true : false; // 3항 연산자
				System.out.println(z);
			}
		};
		
		
		fi.anyMethod(x, y);
		System.out.println(gt.result(10, 30));
		
		
		
		
		
	}

}
