import java.util.*;
public class MethodsAndFields {
	private static final ArrayList<String> values = new ArrayList<>();

	public static void main(String[] args) {
		values.add("A");       // it is allowed to call methods on references
		System.out.println(values);
	}

}
