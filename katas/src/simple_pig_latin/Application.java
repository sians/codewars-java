package simple_pig_latin;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		System.out.println(pigLatin("Pig latin is cool")); 
		// "igPay atinlay siay oolcay"
		System.out.println(pigLatin("This is, my string"));
		// "hisTay siay ymay tringsay"
		System.out.println(pigLatin("Hello world !"));
		// elloHay orldway !
	}

	public static String pigLatin(String str) {
		String [] words = str.split(" ");
		ArrayList<String> result = new ArrayList<>();
		for(String word : words) {
			String pigWord;
			if(word.matches("[A-Za-z0-9]+")) {
				pigWord = word.substring(1, word.length()) + word.charAt(0) + "ay";
			} else if (word.length() < 2) { 
				pigWord = word;
			} else {
				pigWord = word.substring(1, word.length()-1)
						+ word.charAt(0) + "ay"
						+ word.substring(word.length()-1, word.length());
			}
			result.add(pigWord);
		}
		return String.join(" ", result);
	}
	
	public static String topPigLatin(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
	}
	
}
