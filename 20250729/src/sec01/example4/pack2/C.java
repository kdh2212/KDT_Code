package sec01.example4.pack2;

import sec01.example4.pack1.A;

/*
 * 상속을 받을 경우 가능
 */
public class C extends A{
	public C() {
		super();
		this.field = "value";
		this.method();
	}
	
	public  void method() {
		// 다른 패키지에 있어서 불가능하다.
//		A a = new A();
		this.field = "value";
		this.method();
	}
}
