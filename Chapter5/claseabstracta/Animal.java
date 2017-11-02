package claseabstracta;

public abstract class Animal {
	public abstract String getName();
}

abstract class BigCat extends Animal {
	public String getName() {
		return "BigCat";
	}
	public abstract void roar();
	private void hola() {
		System.out.println("hola");
	}
}

class Lion extends BigCat {
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
	
	private void hola() {
		System.out.println("hola");
	}
}