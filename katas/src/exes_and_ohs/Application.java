package exes_and_ohs;

public class Application {

	public static void main(String[] args) {
		System.out.println(getXO("xxxXooOo")); // true
		System.out.println(getXO("xxx23424esdsfvxXXOOooo")); // false
		
		System.out.println(topGetXO("xxxXooOo")); // true
		System.out.println(topGetXO("xxx23424esdsfvxXXOOooo")); // false

	}

	// my attempt
	public static boolean getXO(String str) {
		str = str.toLowerCase();
		long x = str.chars().filter(ch -> ch == 'x').count();
		long o = str.chars().filter(ch -> ch == 'o').count();
		return x == o;
	}
	
	// top attempt
	public static boolean topGetXO(String str) {
		str = str.toLowerCase();
		return str.replace("o", "").length() == str.replace("x", "").length();
	}

}
