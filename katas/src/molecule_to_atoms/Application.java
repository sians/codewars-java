package molecule_to_atoms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		System.out.println(getAtoms("H2O"));
		System.out.println(getAtoms("Mg(OH)2"));
		System.out.println(getAtoms("K4[ON(SO3)2]2"));
	}
	
	
	// I N C O M P L E T E     A T T E M P T
	
	public static Map<String,Integer> getAtoms(String str) {
		HashMap<String, Integer> partials = new HashMap<String,Integer>();
		if(str == "") {
			return new HashMap<String,Integer>();
		} else if (!(str.indexOf("[") == -1)){
			String partial = str.substring(str.indexOf("["), str.indexOf("]")+1);
			System.out.println(partial);
		} else if (!(str.indexOf("(") == -1)){
			String partial = str.substring(str.indexOf("("), str.indexOf(")")+1);
//			System.out.println(partial);
		}
		
//		String [] chars = str.split("");
////		Stack<String> stack = new Stack<>();
//		HashMap<String, Integer> result = new HashMap<>();
//		String molecule = "";
//		for(int i = 0; i < chars.length; i++) {
//			if(chars[i].matches("[([{]")) {
//				molecule += chars[i];
//			} else if (chars[i].matches("[A-Z]")) {
//				molecule += chars[i];
//			}
//		}
		return new HashMap<String,Integer>();
	}

}
