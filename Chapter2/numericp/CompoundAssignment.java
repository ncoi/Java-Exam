package numericp;

public class CompoundAssignment {
	public static void main(String[] args) {
		long x = 10;
		int y = 5;
		y *= x;
		// y = y * x; // DOESNT COMPILE
		System.out.println(y);
	}
}
