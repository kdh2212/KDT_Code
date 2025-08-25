package sec01.exam05;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			System.out.println(Outter.this.field);// 바깥쪽 접근하기위해 
			Outter.this.method();
		}
	}

	public static void main(String[] args) {
		Outter.Nested nested = new Outter().new Nested();
		nested.print();
		nested.method();// Nested-method
	}
}
