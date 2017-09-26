package defaultmethod;

public interface Run {
	default int getSpeed() {
		return 16;
	}
}
