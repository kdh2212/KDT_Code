package sec01.collectionframwork;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍", 100);
		map.put("김",200);
		map.put("박", 300);
		int value = map.get("김");
		System.out.println(value);
		

	}

}
