package arraycalc;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDIntArray;
		String[][] twoDStringArray;
		double[][] twoDDoubleArray;
		
		//Given a 2d array called `arr` which stores `int` values
		int[][] arr = {{1,2,3},
		               {4,5,6}};

		//We can get the value `4` by using
		int retrieved = arr[1][0];
		
		// Method one: declaring and intitializing at the same time
		double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

		// Method two: declaring and initializing separately:
		String[][] stringValues;
		stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};
	
		//double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

		doubleValues[2][2] = 100.5;
		// This will change the value 7.6 to 100.5
		
		
		//for(int i = 0; i < matrix.length; i++) { //outer loop first index
		 //   for(int j = 0; j < matrix[i].length; j++) { //inner loop second index
		 //       System.out.println(matrix[i][j]);
		 //   }
		//}
		
		
		//for(int i = 0; i < matrix[0].length; i++) { //outer loop second index
		//    for(int j = 0; j < matrix.length; j++) { //inner loop first index
		 //       System.out.println(matrix[j][i]);
		    }
	//	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

//}
