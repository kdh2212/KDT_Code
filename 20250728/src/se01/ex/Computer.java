package se01.ex;

public class Computer {

	int sum(int ... val) {
		int sum =0;
		for(int v : val) {
			sum += v;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Computer com = new Computer();
		int ret = com.sum(1,2,3);
		System.out.println(ret);
	}

}
