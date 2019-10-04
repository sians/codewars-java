package youre_a_square;

public class Application {

	public static void main(String[] args) {
		System.out.println(isSquare(-1));
		System.out.println(isSquare(-14));
		System.out.println(isSquare(0));
		System.out.println(isSquare(3));
		System.out.println(isSquare(4));
		System.out.println(isSquare(25));
	}
	
	public static boolean isSquare(int num) {
		double root = Math.sqrt(num);
		return (root % 1.0) == 0;
	}
}
