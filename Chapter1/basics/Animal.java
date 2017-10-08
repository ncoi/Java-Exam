// PIC (Package, Import, Class)	

package basics;

import java.util.Random;

public class Animal {
	/* Fields and instance initializer blocks are run in the order in which they appear in
	the file. */
	String name = "nelson";
	{
		name = "camilo";
	}
	
	// then the constructor
	public Animal() {
		name = "orduz";
	}
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
		Animal a = new Animal();
		System.out.println(a.name);
	}
}