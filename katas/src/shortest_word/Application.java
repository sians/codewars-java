package shortest_word;

import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
		
		System.out.println(topFindShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println(topFindShort("turns out random test cases are easier than writing out basic ones"));
	}
	
	// my attempt
	public static int findShort(String s) {
		String [] array = s.split(" ");
		String shortest = array[0];
		for(String word : array) {
			if(word.length() <= shortest.length()) {
				shortest = word;
			}
		}
		return shortest.length();
	}
	
	// top attempt
	public static int topFindShort(String s) {
		return Stream.of(s.split(" "))
				.mapToInt(String::length)
				.min()
				.getAsInt();
	}

}
