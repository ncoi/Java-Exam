package numericp;

public class OptionalLabels {

	public static void main(String[] args) {
		
		int[][] myComplexArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		OUTER_LOOP: for(int[] simpleArray: myComplexArray) {
			INNER_LOOP:for(int i = 0; i < simpleArray.length; i++) {
				if(simpleArray[i] % 2 == 0) continue OUTER_LOOP;
				System.out.print(simpleArray[i] + "\t");
			}
			System.out.println();	
		}
		
	}

}
