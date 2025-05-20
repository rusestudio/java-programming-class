package sample2.w11;

import java.util.Random;
import java.util.Scanner;

public class BinaryPractice {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = ran.nextInt(1, 101);
		}
		
		System.out.println("처음 배열");
		printArr(array);
		sorted(array);
		
		System.out.println("\n삽입 정렬된 배열(값을 확인하기 위한 출력)");
		printArr(array);
		
		System.out.print("\n\n어떤 숫자의 위치를 찾겠습니까? ");
		int key = sc.nextInt();
		
		if (binSearch(array, key) == -1) {
			System.out.println("저장되어 있는 숫자가 아닙니다.");
		} else {
			System.out.println(key + "은 " + binSearch(array, key) + "번째 인덕스 입니다.");
		}
		sc.close();
		
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
	/**searching method
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binSearch (int[] arr, int key) {
		int low = 0;
		int n = arr.length;
		int high = n - 1;
		int mid;
		
		while(high >= low) {
			mid = (high + low) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
