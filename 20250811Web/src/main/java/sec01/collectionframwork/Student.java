package sec01.collectionframwork;

public class Student {
	String sno;
	String name;
	
	public Student(String sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	

	@Override
	public int hashCode() {
		
		return sno.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if((sno.equals(std.sno))&&(name.equals(std.name))) {
				return true;
			} 
			
		}
		return false;
	}
}

	


