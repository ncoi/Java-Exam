package arrayclass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);

		// add()
		list.add("hawk");
		list.add(true);

//		System.out.println(list);

		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
//		System.out.println(birds);   // [blue jay, cardinal, hawk, robin]
		
		// remove()
		birds.remove("hawk");
//		System.out.println(birds.remove(1));
//		birds.remove(9); // IndexOutOfBoundsException
//		System.out.println(birds);
		
		// set()
		birds.set(0, "hola");   // [hola, robin]
//		System.out.println(birds);
		birds.set(2, "chao");   // Exception
		// birds.set(2, 2); // compile error
		
		// isEmpty() and size()
//		System.out.println(birds.isEmpty());
//		System.out.println(birds.size());\
		
		
		// clear()
//		birds.clear();
//		System.out.print(birds.size());
		
		// contains()
//		System.out.println(birds);
//		System.out.println(birds.contains("hola"));
		
		// equals
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));
		list1.add("a");
		System.out.println(list1.equals(list2));
		list2.add("a");
		System.out.println(list1.equals(list2));
		list1.add("b");
		list2.add(0, "b");
		System.out.println(list1.equals(list2));
		
	}

}
