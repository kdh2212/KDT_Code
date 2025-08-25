package sec01.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {

//		List<String> list1 = new ArrayList<String>();
//		list1.add("홍길동"); list1.add("김한나"); list1.add("김자바");
		
		
		List<String> list = Arrays.asList("홍길동","김한나","김자바");
		
//		Stream<String> stream = list.stream();
		list.stream().forEach(n -> System.out.println(n));
	}

}
