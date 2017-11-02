package exceptions2;

public class PrintExceptions {
	public static void main(String... args){
		try {
			hop();
		} catch(Exception e) {
			System.out.println(e);               // java.lang.Exception: cannot hop
			System.out.println(e.getMessage());  // cannot hop
			e.printStackTrace();                 // stack trace
		}
	}
	
	private static void hop() throws Exception{
		System.out.println(5/0);
//		throw new Exception("cannot hop");
		throw new IllegalArgumentException();
	}
}
