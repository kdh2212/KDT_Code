package sec01.example4.pack1;

public class B {
	public  void method() {
		// 같은 패키지에 있어서 가능하다.
		A a = new A();
		a.field = "value";
		a.method();
	}
	
}
