package arrayclass;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// List to array
//		List<String> lista = new ArrayList<>();
//		lista.add("hola");
////		Object[] arr = lista.toArray();
//		String[] arr = lista.toArray(new String[0]);
//		for(String o : arr){
//			System.out.println(o);
//		}
		
		
		// array to List
		Integer[] arr2 = {4,3,2,1};
		List<Integer> list = Arrays.asList(arr2);
		List<Integer> list2 = Arrays.asList(1, 2, 3); // asList() takes varags
		arr2[3] = 6;
		// list.remove(0); // unsupported operation, we are not allowed to change size of the list
		Collections.sort(list);
		System.out.print(list);
	}

}
