package sample2.w10;

public class Sum {
	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3};
		int[][] array2 = {{12, 4}, {8, 10, 9}};
		int[][][] array3 = {
				{{1, 12, 7}, {6, 4}}, 
				{{5, 8,}, {17, 3, 5}}, 
				{{9, 10}, {5, 1}}};
		
		System.out.println("sum of array1 : " + sumOfArray(array1));
		System.out.println("sum of array2 : " + sumOfArray(array2));
		System.out.println("sum of array3 : " + sumOfArray(array3));
	} 
	public static int sumOfArray (int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static int sumOfArray (int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	public static int sumOfArray (int[][][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					sum += arr[i][j][k];
				}
			}
		}
		return sum;
	}
}
