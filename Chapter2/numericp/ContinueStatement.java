package numericp;

public class ContinueStatement {
	public static void main(String[] args) {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue;
				System.out.print(" " + a + x);
			}
		}
	}
}

// continue FIRST_CHAR_LOOP: 1a 3a 4a
// continue: 1a 1c 3a 3c 4a 4c