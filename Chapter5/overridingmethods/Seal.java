package overridingmethods;

public class Seal extends Animal{
	
	public void sayHi() {
		System.out.println("Hi Seal");
	}
	
	public static void hola() {
		System.out.println("adios");
	}

	public static void main(String[] args) {
		Seal s = new Seal();
		s.sayHi();
		hola();
		say();
	}

}
