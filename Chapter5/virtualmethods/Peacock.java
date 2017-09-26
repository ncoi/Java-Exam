package virtualmethods;

public class Peacock extends Bird {
	public String getName() {
		return "Peacock";
	}
	
	public int wings = 2;
	
	public static void main(String[] args) {
		Peacock peacock = new Peacock();
		peacock.displayInformation();
		System.out.println(peacock.wings);
		
		Bird bird = new Peacock();
		System.out.println(bird.getName());
		bird.displayInformation();
	}
}
