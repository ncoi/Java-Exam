package hidingstaticmethods;

public class Panda extends Bear{
	public static void eat() {
		System.out.println("Panda is eating"); 
	}

	public static void main(String[] args) {
		eat();
	}

}
