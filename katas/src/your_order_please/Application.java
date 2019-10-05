package your_order_please;

import java.util.Arrays;
import java.util.Comparator;

public class Application {

	public static void main(String[] args) {
		System.out.println(order("is2 Thi1s T4est 3a"));
		// "Thi1s is2 3a T4est"
	}
	
	public static String order(String words) {
		if (words == "") return "";
		String [] array = words.split(" ");
		String [] resultArray = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			String indexString = array[i].replaceAll("[*a-zA-Z]", "");
			int indexInt = Integer.parseInt(indexString);
			resultArray[indexInt - 1] = array[i];
		}
		return String.join(" ", resultArray);
	}

	public static String topOrder(String words) {
	    return Arrays.stream(words.split(" "))
	    	      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
	    	      .reduce((a, b) -> a + " " + b).get();
	}	
	
}
