package defaultmethods;

public interface HasFins {
	default int getNumberOfFins(){
		return 4;
	}
	default double getLongestFinLength() {
		return 20.0;
	}
	default boolean doFishHaveScales() {
		return true;
	}
	
	static void hola() {
		System.out.println("HasFins");
	}
}
