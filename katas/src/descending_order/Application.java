package descending_order;

import java.util.ArrayList;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		System.out.println(descendingOrder(21445));
	}
	
	public static int descendingOrder(int num) {
		if(num == 0) {
			return 0;
		}
		
		ArrayList<Integer> digits = new ArrayList<>();		
		while(num>0) {
			digits.add(num % 10);
			num = num / 10;
		}
		Collections.sort(digits, Collections.reverseOrder());
		String stringNum = "";
		for(int digit : digits) {
			stringNum = stringNum + Integer.toString(digit);
		}
		num = Integer.parseInt(stringNum);
		return num;
	}

}
