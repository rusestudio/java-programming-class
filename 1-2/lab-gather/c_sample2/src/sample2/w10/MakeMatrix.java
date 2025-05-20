package sample2.w10;

public class MakeMatrix {
	public static void main(String[] args) {
		int[][] arr1 = new int[5][5];
		int[][] arr2 = new int[5][5];
		int[][] arr3 = new int[5][5];
		
		//first
		System.out.println("첫 번째 배열 : ");
		int k = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = k;
				k++;
			}
		}
		printMatrix(arr1);
		
		//second
		System.out.println("\n두 번째 배열 : ");
		int l = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = l;
				l++;
			}
		}
		printMatrix(arr2);
		
		//third
		System.out.println("\n세 번째 배열 : ");
		k = 1;
		for (int i = 0; i < arr3.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr3[i].length; j++) {
					arr3[i][j] = k;
					k++;
				}
			} else {
				for (int j = arr3[i].length - 1; j >= 0; j--) {
					arr3[i][j] = k;
					k++;
				}
			}
		}
		printMatrix(arr3);
	}
	public static void printMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
