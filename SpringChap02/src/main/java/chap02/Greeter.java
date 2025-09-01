package chap02;

public class Greeter {
	private String format;
	
	public String greet(String guest) {
		return String.format(format ,guest);
	}

	public void setFormat(String format) { // 자동으로 세터를 만들 수 있다.
		this.format = format;
	}

	
}
