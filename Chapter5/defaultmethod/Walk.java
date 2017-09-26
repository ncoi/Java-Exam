package defaultmethod;

public interface Walk {
	default int getSpeed() {
		return 8;
	}
}
