package sec03.exam02;



public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("--------------------------------");
		
		
		
		// 자식으로 객체 생성
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------------------------------");
		
		
		// 매개변수 다형성을 활용
		animalSound(new Dog());
		animalSound(new Cat());
		
		

	}
	
	// 매개변수 다형성을 활용
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
