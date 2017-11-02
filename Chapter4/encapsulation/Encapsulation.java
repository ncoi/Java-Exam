package encapsulation;

public class Encapsulation {
	private int numberEggs;
	public int getNumberEggs() {
		return numberEggs;
	}
	
	public void setNumberEggs(int numberEggs) {
		if(numberEggs >=0) this.numberEggs = numberEggs;
	}
	
	public static void main(String[] args) {	
		Encapsulation e = new Encapsulation();
		e.setNumberEggs(2);
	}
}
