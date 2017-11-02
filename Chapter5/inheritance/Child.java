package inheritance;

public class Child extends Parent{
	private int num;
	public Child(int num) {
		super(num);
		this.num = num;
	}
	public static void main(String... args) {
		Child c = new Child(4);
		System.out.println(c.num);
	}
}
