package sec01.collectionframwork;

import java.util.*;

public class StudentEx {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
	
		map.put(new Student("1234", "홍"),100);
		map.put(new Student("4321", "김"),90);
		map.put(new Student("1234", "홍1"),70);
		
		
		map.put(new Student("12345", "홍길동"),95);
		map.put(new Student("12345", "홍길동"),95);
		
		System.out.println("총 Entry 수 :" + map.size());
		System.out.println(map.get(new Student("1234","홍1")));
	}

}
