package string_merger;

public class Application {

	public static void main(String[] args) {
		System.out.println(isMerge("codewars", "code", "wars")); //  true
		System.out.println(isMerge("codewars", "code", "code")); //  false
		System.out.println(isMerge("codewars", "cdwr", "oeas")); // true
		System.out.println(isMerge("codewars", "cdwr", "")); // false
		System.out.println(isMerge("codewars", "cod", "wars"));  // false
		System.out.println(isMerge("Can we merge it? Yes, we can!", "a wee it?Ye, e n", "Cne mrg swca!")); // true
		System.out.println(isMerge("Yes", "Yes", "")); // true
		
	}
	
    public static boolean isMerge(String s, String part1, String part2) {
    	if (part1.length() + part2.length() != s.length()) return false;
    	
		if (part1.isEmpty() || part2.isEmpty()) {
			boolean equal = (s.equals(part1 + part2)) ? true : false;
			return equal;
		}
		
		char c = s.charAt(0);
		if (c == (part1.charAt(0)) && isMerge(s.substring(1), part1.substring(1), part2)) {
			return true;
		} else if (c == (part2.charAt(0)) && isMerge(s.substring(1), part1, part2.substring(1))) {
			return true;
		} else {
			return false;
		}
     }
	

}
