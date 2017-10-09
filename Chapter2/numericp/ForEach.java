package numericp;

public class ForEach {

	public static void main(String[] args) {
//		String[] names = {"Lisa", "Kevin", "Roger"};
//		for(String name: names) {
//			System.out.println(name);
//		}
		
		
		int[][] myComplexArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int[] simpleArray: myComplexArray) {
			for(int i = 0; i < simpleArray.length; i++) {
				System.out.print(simpleArray[i] + "\t");	
			}
			System.out.println();
			
		}

	}

}
