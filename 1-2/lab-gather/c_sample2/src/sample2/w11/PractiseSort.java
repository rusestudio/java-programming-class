package sample2.w11;

import java.util.Random;

public class PractiseSort {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++) {
			array[i] = ran.nextInt(1, 101);
		}
		System.out.println("처음 배열");
		printArr(array);
		
		sorted(array);
		
		System.out.println("\n삽입 정렬된 배열");
		printArr(array);
	}
	/**sorting method
	 * 
	 * @param arr
	 */
	public static void sorted (int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			insert(arr, i);
		}
	}
	public static void insert (int[] arr, int i) {
		int temp = arr[i];
		int j = i - 1;
		while(j >= 0 && temp < arr[j]) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = temp;
	}
	/**printing method
	 * 
	 * @param arr
	 */
	public static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
}
