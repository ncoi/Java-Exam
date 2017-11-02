package lambdas;
import java.util.List;
import java.util.ArrayList;

public class ArrayListPredicate {

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		
		bunnies.removeIf(b -> b.charAt(0) != 'h');
		
		System.out.println(bunnies); // [hoppy]
	}

}
