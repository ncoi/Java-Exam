package stringclass;

public class StringClass {
	public static void main(String[] args) {
		String animal = "animals";
		
		// length()
		System.out.println(animal.length());
		
		// charAt()
		System.out.println(animal.charAt(4)); // a
		
		// indexOf()
		System.out.println(animal.indexOf("ls")); // 5
		
		// substring()
		System.out.println(animal.substring(2,7)); // i: exclusive, returns what's before 3
		
		// toUpperCase() toLowerCase()
		System.out.println(animal.toUpperCase()); // ANIMALS
		System.out.println("ABC123".toLowerCase()); // abc123
		
		// equals() equalsIgnoreCase()
		System.out.println(animal.equals("AnImAls")); // false
		System.out.println(animal.equalsIgnoreCase("AnImAls")); // true
		
		// startsWith() endsWith()  ONLY ACCEPTS STRING / CASE SENSITIVE
//		System.out.println(animal.startsWith('A')); // doesn't compile
		System.out.println(animal.startsWith("A")); // false
		System.out.println(animal.endsWith("s")); // true
		
		// contains() ONLY ACCEPTS STRING / CASE SENSITIVE
		System.out.println(animal.contains("an")); // true
		System.out.println(animal.contains("AN")); // true
		
		// replace() / CASE SENSITIVE
		System.out.println(animal.replace('A', 'u')); // X
		System.out.println(animal.replace("a", "u")); // unimuls
		
		// trim()
		System.out.println("   a m c   ".trim());
		
		// Method Chaining
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
	}
}
