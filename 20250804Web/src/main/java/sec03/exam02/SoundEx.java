package sec03.exam02;

public class SoundEx {
	private static void printSound(Soundable soundable) { // 매개변수 다형성
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
