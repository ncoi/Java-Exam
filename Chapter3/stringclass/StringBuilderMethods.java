package stringclass;
public class StringBuilderMethods {

	public static void main(String[] args) {
		
		// charAt(), indexOf(), length(), and substring()
//		StringBuilder sb = new StringBuilder("animals");
//		char ca = sb.charAt(6);
//		int io = sb.indexOf("m"); // doesn't accept chars
//		int le = sb.length();
//		String ss = sb.substring(4, 7);
//		System.out.println(ca + " " + io + " " + le + " " + ss);
//	
//		// append()
//		StringBuilder sb1 = new StringBuilder().append(1);
//		sb1.append(true).append("hola");
//		System.out.println(sb1);
//		
		// insert()
//		StringBuilder sb2 = new StringBuilder("animals");
//		sb2.insert(7, '-');
//		System.out.println(sb2);
//		
//		// delete() and deleteCharAt() / DELETES EXCLUSIVE (DOESN'T COUNT ENDING INDEX)
		StringBuilder sb3 = new StringBuilder("animals");
		sb3.delete(0, 2);
		sb3.deleteCharAt(3);
		System.out.println(sb3);
		
		// reverse()
//		StringBuilder sb4 = new StringBuilder("anita lava la tina");
//		System.out.println(sb4.reverse());
	}

}
