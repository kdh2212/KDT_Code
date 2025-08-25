package sec01.exam04;

public class Outter {
	public void method1(int arg) {
		
//		arg = 200; 바꿀 수 없게 한다. 즉 위에 int arg가 final 속성을 가지게 된다.
		int var = 1; 
//		var = 2;// 중간에 값을 바꿔도 오류가 즉 위에 int var도 final 이다.
		class Inner {
			public void method() {
				int result = arg + var;
			}
		}
	}

}
