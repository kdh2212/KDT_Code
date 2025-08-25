package quiz3;
/*
 * Student 클래스를 만들고 학번(sno) 컬럼이 같으면 같은 객체로 판명되도록 Object 클래스를 재정의한 후
 * 테스트하는 자바코드를 만들어 보세요.(p.495 참조)
 */
public class Student {
	String sno;
	String name;
	
	public Student(String sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		
		return sno.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(sno.equals(std.sno)) {
				return true;
			}
		}
		return false;
	}
	
	

}
