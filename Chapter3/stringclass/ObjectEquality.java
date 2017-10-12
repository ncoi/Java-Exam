package stringclass;
import java.io.Console;

public class ObjectEquality {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("sb1");
		StringBuilder sb2 = new StringBuilder("sb2");
		
		String s1 = "Hello World";
		String s2 = " Hello World".trim();
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}
}
