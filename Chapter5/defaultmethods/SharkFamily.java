package defaultmethods;

public interface SharkFamily extends HasFins {
	default int getNumberOfFins() {
		return 8;
	}
	double getLongestFinLength();
	
	static void hola(){
		System.out.println("SharkFamily");
	}
}
