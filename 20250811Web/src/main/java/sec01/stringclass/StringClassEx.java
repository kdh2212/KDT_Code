package sec01.stringclass;

public class StringClassEx {

	public static void main(String[] args) {
	
		
		String s3 = "                       ert                        ";
		System.out.println(s3.trim());
		
		
		String s1 = "JAVA";
		String s2 = "java";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String ssn = "123456789";
		System.out.println(ssn.substring(0,6));

	}

}
