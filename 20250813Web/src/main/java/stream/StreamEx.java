package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StreamEx {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("김","나","박","이");
//		for(String str : list) { // arraylsit에서 데이터를 꺼낸다.
//			System.out.println(str);
//		}
//
//		System.out.println("---------------------------------------------");
//		// for 문을 사용하지 않는 다른 방식
//		list.stream().forEach((s) -> System.out.println(s));
//		
//		System.out.println("---------------------------------------------");
//		int sum = IntStream.rangeClosed(1, 10).sum();
//		System.out.println(sum);
//		
//		System.out.println("---------------------------------------------");
//		IntStream.rangeClosed(1, 10).forEach((i)->{
//			System.out.println(i);
//		});
//		
//		System.out.println("---------------------------------------------");
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);
//		
//		
//		List<String> items = Arrays.asList("apple","banana","orange","apple");
//		long count = items.stream().filter(item -> item.equals("apple")).count();
//		System.out.println(count);
		
		List<Integer> nums = Arrays.asList(5,1,9,3);
		int max = nums.stream().max((a,b) -> a - b).get();
		System.out.println(max);
		
	}

}
