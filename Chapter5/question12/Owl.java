package question12;

public class Owl implements Nocturnal{
	public boolean isBlind() {
		return false;
	}
	
	public static void main(String[] args) {
		Nocturnal nocturnal = new Owl();
		System.out.println(nocturnal.isBlind());
	}
}
