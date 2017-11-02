package exceptions2;

public class ExceptionTest {
	public static void doSomething() {
		try {
			System.out.println("h");
			throw new Exception();
		} catch(Exception r) {
			System.out.println("o");
		} finally {
			System.out.println("l");
		}
		
		System.out.println("a");
	}
	
	public static void main(String[] args) {
		doSomething();
	}
}
