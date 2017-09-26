package interfaces;

public interface IsWarmBlooded {
	boolean hasScales();
	default double getTemperature() {
		return 10.0;
	}
}
