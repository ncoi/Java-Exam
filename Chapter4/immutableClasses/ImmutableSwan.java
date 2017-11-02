package immutableClasses;

public class ImmutableSwan {
	private int numberEggs;
	
	public ImmutableSwan(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs() {
		return numberEggs;
	}

	public static void main(String[] args) {
		ImmutableSwan s = new ImmutableSwan(10);
		System.out.println(s.getNumberEggs());
	}

}
