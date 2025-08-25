package dp.templateMethod;

/*
 * template 
 * 내가 지정한 방식 순서로 실행하는 방식
 */
public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	public final void display() { // 내가 지정한 순서로 실행 , charDisplay 에서 재정의를 하지 못하게 final를 붙였다.
		open();
		for(int i=0; i < 5; i++) {
			print();
		}
		close();
	}
}
