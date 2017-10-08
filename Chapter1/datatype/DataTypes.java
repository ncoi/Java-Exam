package datatype;

class DataTypes {
	static int entero;
	static double decimald;
	static float decimalf;
	static boolean bool;
	static char car;
	
	
	public void myLocalVariableMethod() {
		int numero;
		numero = 4;
		System.out.print(numero);  // does not compile
	}
	
	static long myLong = 1123L;
	
	static int decimal = 56;        // or base 10
	static int binary = 0b11;       // or base 2
	static int octal = 017;         // or base 8
	static int hexadecimal = 0x1f;  // or base 16
	
	static int validNumber = 1_000_000;
	static double alsoValidNumber = 1_000_000.000_1;
	
	public static void main(String ...args) {
//		System.out.println(decimal);
//		System.out.println(binary);
//		System.out.println(octal);
//		System.out.println(hexadecimal);
		
//		System.out.println(validNumber);
//		System.out.println(alsoValidNumber);
		
		System.out.println(entero);
		System.out.println(decimald);
		System.out.println(decimalf);
		System.out.println(bool);
		System.out.println(car);
		
		
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Float.MAX_VALUE);
//		System.out.println(Double.MAX_VALUE);
	}
}

class Hello {}
