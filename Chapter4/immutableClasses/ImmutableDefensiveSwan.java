package immutableClasses;

public class ImmutableDefensiveSwan {
	private StringBuilder builder;
	
	public ImmutableDefensiveSwan(StringBuilder sb) {
		builder = new StringBuilder(sb);
	}
	
	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}
	
	public static void main(String... args) {
		StringBuilder sb = new StringBuilder("hola");
		ImmutableDefensiveSwan s = new ImmutableDefensiveSwan(sb);
		StringBuilder sb2 = s.getBuilder();
		sb.append(" adios");
		sb2.append(" otros");
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
	}
}
