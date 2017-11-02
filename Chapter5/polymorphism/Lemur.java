package polymorphism;

public class Lemur extends Primate implements HasTail{

	@Override
	public boolean isTailStriped() {
		return true;
	}
	
	public int age = 10;
	
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		Lemur lemur2 = (Lemur)hasTail;
		System.out.println(hasTail);
		System.out.println(lemur2.age);
		
		Primate primate = lemur;
		Lemur lemur3 = (Lemur)primate;
//		Primate primate = new Primate();
//		primate = lemur;
		System.out.println(primate.hasHair());
		
		HasWings hasWings = lemur;
		System.out.println(hasWings.isWinged());
	}
}
