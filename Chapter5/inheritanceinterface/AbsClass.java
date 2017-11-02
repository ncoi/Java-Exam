package inheritanceinterface;

public abstract class AbsClass implements Seal{
	public int getTailLength() {
		return HasTail.numero;
	}
	
	public int getNumberOfWhiskers() {
		return HasWhiskers.numero;
	}
}
