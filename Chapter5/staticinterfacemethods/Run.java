package staticinterfacemethods;

public interface Run {
	public default int getNumCarrots() {
		return 2;
	}
}
