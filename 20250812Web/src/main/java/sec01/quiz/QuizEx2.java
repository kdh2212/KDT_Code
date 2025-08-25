package sec01.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuizEx2 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java","Lamda","Stream");
		words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);

	
	}

}
