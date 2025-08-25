package se01.ex;


class G{
	void gmethod() {}
}

class H{
	void hmethod() {
		G g = new G();
		g.gmethod();
	}
}

interface D{}

class Engine implements D{}
class Tire implements D{}
class Handle implements D{}

class Car2 extends Machine{
	Engine d1 = new Engine();
	D d2 = new Tire();
	D d3 = new Handle();
	
	
	
	
}

class Person{  
	void hmethod() {
		G g = new G();
		g.gmethod();
	}
}

class Machine{
	
}

public class ClassEx1 {

	public static void main(String[] args) {



	}

}
