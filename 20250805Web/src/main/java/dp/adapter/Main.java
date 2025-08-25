package dp.adapter;

public class Main {

	// 무엇이 어댑터 인가?
	public static void main(String[] args) {
		Print p = new PrintBanner("안녕");
		p.printStrong();
		p.printWeak();
	}

}
