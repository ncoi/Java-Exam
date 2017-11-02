package claseabstracta;

abstract class AbstractAnimal {
	protected int age;
	public void eat() {
		System.out.println("Animal is eating");
	}
	public abstract String getName();
}

class Swan extends AbstractAnimal {
	public String getName() {
		return "Swan";
	}	
}