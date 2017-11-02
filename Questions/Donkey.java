
public class Donkey implements Movable {
	int LOCATION = 200;

	@Override
	public void move(int by) {
		LOCATION = LOCATION + by;
		System.out.println("move: " + LOCATION);
	}

	@Override
	public void moveBack(int by) {
		LOCATION = LOCATION - by;
	}
	
	public static void main(String... args) {
		Donkey d = new Donkey();
		System.out.println(d.LOCATION);
		System.out.println(Movable.LOCATION);
		
		Movable m = new Donkey();
		System.out.println(m.LOCATION);
		m.move(10);
		Donkey dk = (Donkey)m;
		System.out.print(dk.LOCATION);
	}
}
