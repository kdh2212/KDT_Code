package dp.adapter;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
		
	}

	@Override
	public void printWeak() { // <--- 이게 adapter
		showWithParen();
	}

	@Override
	public void printStrong() {// <--- 이게 adapter
		showWithAster();
	}

}
