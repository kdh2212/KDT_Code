package se01.ex;
/*
 * 싱글톤
 */
public class Single1 {
	private static Single1 s1 = new Single1(); 
	private Single1() {}
	
	static Single1 getS1() {
		return s1;
	}
	
	
}
