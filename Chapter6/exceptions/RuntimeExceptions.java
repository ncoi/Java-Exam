package exceptions;

public class RuntimeExceptions {
	
	/* ExceptionInInitializerError */
//	static {
//		int[] countsOfMoose = new int[3];
//		int num = countsOfMoose[-1];
//	}
	
	public static void doNotCodeThis(int num) {
		doNotCodeThis(1);
	}
	public static void main(String[] args) {
		try {
			/* ArithmeticException */
//			int x = 1 / 0;   
			
			/* ArrayIndexOutOfBoundsException */
//			String[] arr = new String[0];
//			System.out.println(arr[0]);
			
			/* ClassCastException */
//			String type = "moose";
//			Object obj = type;
//			Integer number = (Integer) obj;
			
			/* NumberFormatException */
			//Integer.parseInt("abc");
			
			/* StackOverflowError*/
			doNotCodeThis(1);
		} catch(RuntimeException e) {
			System.out.println(e);
		}
	}
}
