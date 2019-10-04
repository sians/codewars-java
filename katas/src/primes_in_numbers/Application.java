package primes_in_numbers;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		System.out.println(factors(7775460));
		// "(2**2)(3**3)(5)(7)(11**2)(17)"
		System.out.println(factors(77));

		System.out.println(topFactors(7775460));
		// "(2**2)(3**3)(5)(7)(11**2)(17)"
		System.out.println(topFactors(77));
		
	}
	
	public static String factors(int num) {
		if(num==0 || num==1) {
			return "(" + num + ")";
		}
		LinkedHashMap<Integer, Integer> seive = new LinkedHashMap<>();
		for(int i = 2; i <= num; i++) {
			while(num % i == 0) {
				if(seive.get(i) == null) {
					seive.put(i, 0);
				}
				seive.put(i, seive.get(i) + 1);
				num = (int) Math.floor(num / i);
			}
		}
		String result = "";
		for(Map.Entry<Integer, Integer> entry : seive.entrySet()) {
			if(entry.getValue() > 1) {
				result += ("(" + entry.getKey() + "**" + entry.getValue() + ")"); 
			} else {
				result += ("(" + entry.getKey() + ")");
			}
		}		
		return result;
	}
	
	public static String topFactors(int num) {
        String result = "";
        for (int fac = 2; fac <= num; ++fac) {
            int count;
            for (count = 0; num % fac == 0; ++count) {
                num /= fac;
            }
            if (count > 0) {
                result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
            }
        }
        return result;
	}

}
