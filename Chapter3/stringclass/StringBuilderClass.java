package stringclass;

public class StringBuilderClass {
	public static void main(String[] args) {
//		StringBuilder alpha = new StringBuilder();
//		for(char current = 'a'; current <= 'z'; current++)
//			alpha.append(current);
//		System.out.println(alpha); 			  // prints: abcdefghijklmnopqrstuvwxyz
//		System.out.println(alpha.toString()); // prints: abcdefghijklmnopqrstuvwxyz
		
		
		// Chaining Methods
//		StringBuilder sb = new StringBuilder("start");
//		sb.append("+middle");
//		StringBuilder same = sb.append("+end");
//		
//		System.out.println(sb);
//		System.out.println(same);
//		
//		// 
//		StringBuilder a = new StringBuilder("abc");
//		StringBuilder b = a.append("de");
//		b = b.append("f").append("g");  // assignment back to b does nothing
//		System.out.println(a);
//		System.out.println(b);
		
		// size and capacity / SIZE DOESNT EXIST, LENGTH DOES
		StringBuilder sb1 = new StringBuilder();   // default capacity 16
		StringBuilder sb2 = new StringBuilder("builder");
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println("sb1: " + sb1.length() + ", " + sb1.capacity());
		System.out.println("sb2: " + sb2.length() + ", " + sb2.capacity());
		System.out.println("sb3: " + sb3.length() + ", " + sb3.capacity());
	}
}
