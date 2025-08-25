package dp.templateMethod;

public class charDisplay extends AbstractDisplay{
	private char ch;

	public charDisplay(char ch) {
		super();
		this.ch = ch;
	}

	public void open() {
		System.out.print("<<");
		
	}

	@Override
	public void print() {
		System.out.print(ch);
		
	}

	@Override
	public void close() {
		System.out.println(">>");
		
	}

}
