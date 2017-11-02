package polymorphism2;

public class Lemur extends Primate implements HasTail{
	public boolean isTailStriped() {
		return true;
	}
	public int age = 10;
	public static void main(String... args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);      // 10
		
		HasTail ht = lemur;
		System.out.println(ht.isTailStriped());   // true
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}
}
