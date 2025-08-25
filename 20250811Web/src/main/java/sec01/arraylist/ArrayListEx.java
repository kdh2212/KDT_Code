package sec01.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("홍");
		list.add("김");
		list.add("이");
		list.add("박");
		
		for(String str : list) {
			System.out.println(str);
		}
		

	}

}
