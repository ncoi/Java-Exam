package arrayclass;

public class MultidimentionalArray {

	public static void main(String[] args) {
		int[][] vars1; // 2D array
		int vars2[][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4[], space[][]; // a 2D AND a 3D array

		int[][] differentSize = { { 1, 4 }, { 3 }, { 9, 8, 7 } }; // different
																	// size
																	// array

		int[][] args2 = new int[4][];
		args2[0] = new int[5];
		args2[1] = new int[3];
		
		int[][] twoD = new int[3][2];
//		for (int i = 0; i < twoD.length; i++) {
//			for (int j = 0; j < twoD[i].length; j++)
//				System.out.print(twoD[i][j] + " "); // print element
//			System.out.println(); // time for a new row
//		}
		
		for(int[] inner: twoD) {
			for(int num : inner) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

}
