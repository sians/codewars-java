package the_supermarket_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		System.out.println(solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2)); // 9
		System.out.println(solveSuperMarketQueue(new int[] { 3,3,3,5,2,1,1,3,6,5,5,2,1,3,1,1,4,4,2,5 }, 2)); // 32
		System.out.println(solveSuperMarketQueue(new int[] { 10,2,3,3 }, 2)); // 10

		System.out.println(topSolveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2)); // 9
		System.out.println(topSolveSuperMarketQueue(new int[] { 3,3,3,5,2,1,1,3,6,5,5,2,1,3,1,1,4,4,2,5 }, 2)); // 32
		System.out.println(topSolveSuperMarketQueue(new int[] { 10,2,3,3 }, 2)); // 10
	}

	private static int solveSuperMarketQueue(int[] customers, int n) {
		List<Integer> tills = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			tills.add(0);
		}
		for(int customer : customers) {
			Collections.sort(tills);
			int value = tills.get(0);
			tills.set(0, value + customer);
		}
		return Collections.max(tills);
	}
	
	private static int topSolveSuperMarketQueue(int[] customers, int n) {
		int[] result = new int[n];
		
		for(int i = 0; i < customers.length; i++) {
			result[0] += customers[i];
			Arrays.sort(result);
		}
		return result[n-1];
	}
}
