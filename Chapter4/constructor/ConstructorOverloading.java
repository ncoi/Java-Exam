package constructor;

public class ConstructorOverloading {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	
	public ConstructorOverloading(int weight) {
		this(weight, 16);
	}
	
	public ConstructorOverloading(int weight, int numTeeth) {
		this(weight, numTeeth, 6);
	}
	
	public ConstructorOverloading(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}

	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading(10);
		co.print();
	}

}
