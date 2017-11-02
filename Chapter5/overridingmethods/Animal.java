package overridingmethods;

public class Animal {
	public void sayHi() {
		System.out.println("Hi Animal");
	}
	
	static void say() {
		hola();
	}
	
	public static void hola() {
		System.out.println("hola");
	}
}
