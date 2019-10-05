package is_a_number_prime;

public class Application {

	public static void main(String[] args) {
		System.out.println(isPrime(2)); // true
		System.out.println(isPrime(9)); // false
		System.out.println(isPrime(73)); // true
		System.out.println(isPrime(3)); // true
		System.out.println(isPrime(-5)); // false
		System.out.println(isPrime(-41)); // false
		System.out.println(isPrime(10)); // false
		System.out.println(isPrime(44)); // false
		System.out.println(isPrime(4)); // false
	}

	public static boolean isPrime(int num) {
		if (num < 2) return false;
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		for(int i = 3; i*i <= num; i += 2) {
			if (num % i == 0) return false;
		}
		return true;
	}

	public static boolean topIsPrime(int num) {
	    return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
	}
}
