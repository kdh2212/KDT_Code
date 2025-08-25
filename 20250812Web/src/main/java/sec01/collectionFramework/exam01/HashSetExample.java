package sec01.collectionFramework.exam01;

import java.util.*;


public class HashSetExample {

	public static void main(String[] args) {
		Set<String> list = new HashSet<String>();
		
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("Java");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체 수:" + size);
		System.out.println();
		
		
		Iterator<String> it = list.iterator(); // 반복자
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------------------------");
		for(String str : list) { // 향상된 for문 활용
			System.out.println(str);
		}
	}

}
