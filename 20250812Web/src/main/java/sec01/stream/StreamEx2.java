package sec01.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}


	public int getScore() {
		return score;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
}

public class StreamEx2 {

	public static void main(String[] args) {
//		List<Student> list1 = new ArrayList<Student>();
//		list1.add(new Student("홍길동",90));
//		list1.add(new Student("김한나",80));
//		list1.add(new Student("김자바",100));
//		
		
		
		List<Student> list = Arrays.asList(new Student("홍길동",79),new Student("김한나",87),new Student("김자바",89));
//		for(Student stu : list) {
//			System.out.println(stu);
//		}
		
//		Stream<String> stream = list.stream();
		list.stream().forEach(n -> System.out.println(n));
		double avg = list.stream().mapToInt(Student :: getScore).average().getAsDouble();
		System.out.println(avg);
		
		

	}

}
