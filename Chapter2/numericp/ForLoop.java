package numericp;

public class ForLoop {
	public static void main(String[] args) {
//		infinite for loop
//		for( ; ; ) {
//			System.out.println("Hello World");
//		}
		
		int x = 0;
		for( long y = 0, z = 4; x < 5 && y < 10 ; x++, y++ ) {
			System.out.println(y + " ");
		}
		System.out.println(x);
	}
}
