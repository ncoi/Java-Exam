package defaultmethods;

public class Fish implements SharkFamily {
	public void hola() {
		System.out.println("Fish");
	}

	public static void main(String[] args) {
		Fish f = new Fish();
//		System.out.println(f.getNumberOfFins());
		SharkFamily.hola();
	}

	@Override
	public double getLongestFinLength() {
		return 0;
	}

}
