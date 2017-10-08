package exceptions;

public class ThrowingExceptions {
	public static void fall() {
		throw new RuntimeException("new Exception");
	}
	public static void main(String[] args) {
		try {
			fall();
		} catch(RuntimeException e) {
			System.out.println("Catching Exception");
			System.out.println(e);
		} finally {
			System.out.println("This is the end");
		}
		String v = null;
		System.out.println(v.length());
	}
}
