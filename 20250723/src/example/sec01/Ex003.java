package example.sec01;

public class Ex003 {

	public static void main(String[] args) {
		long x;
		int y = 100;
		int z=100;
		x = y;
		z = (int)x;
		System.out.println(x);
		
		int x1 = 1;
		int y1 = 2;
		double z1 = x1/(double)y1;
		double z2 = (double)(x1/y1);
		System.out.println(z1);
		System.out.println(z2);
		
		String str1 = "100";
		int value = Integer.parseInt(str1);

	}

}
