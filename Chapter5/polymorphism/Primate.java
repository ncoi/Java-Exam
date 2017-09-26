package polymorphism;

public class Primate implements HasWings{
	public boolean hasHair() {
		return true;
	}

	@Override
	public boolean isWinged() {
		return true;
	}
}
