package garbagecollector;

public class GarbageC {
	protected void finalize() {
		System.out.println("chao");
	}
	
	public void say() {
		GarbageC hola;
	}
	
	public static void main(String...args) {
		GarbageC gc = new GarbageC();
		GarbageC gc2 = new GarbageC();
		gc = gc2;
		GarbageC gc3 = new GarbageC();
		gc = gc3;
	}
}
