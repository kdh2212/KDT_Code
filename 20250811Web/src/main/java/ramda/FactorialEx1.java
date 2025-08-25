package ramda;


public class FactorialEx1 {
	int fac(int x) {
		// 반복문을 사용하는 팩토리얼
		int result = 1;
		for(int i=1; i<=x; i++) {
			
			result = result * i ;
			
		}
		return result;
		
//		return x == 1 ? 1: x*fac(x-1);
		
//		if(x == 1) {
//			return 1;
//		}else {
//			return x *fac(x-1);
//		}
	}

	public static void main(String[] args) {
		FactorialEx1 fact = new FactorialEx1();
		System.out.println(fact.fac(5));
		
		
//		FacTest ft = (int num)->{
//
//				return num == 1 ? 1 : num * ft.factorial(num-1);
//			
//		};
//		
//		
//
//		ft.factorial(6);
	}

}
