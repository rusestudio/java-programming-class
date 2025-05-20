package sample2.w11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		int[] array = new int[5];
		int[] myArray = new int[5];
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(1, 101);
		}
		System.out.println("기억력 테스트 게임");
		System.out.println();
		
		printArr(array);
		
		System.out.println("\n아무 숫자를 입력하면 숫자들 감춥니다:"); 
		int a = sc.nextInt();
		
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		
		System.out.println("어떤 숫자들이 있는지 맞춰보세요.\n기회는 5번 입니다:");
		for(int i = 0; i < 5; i++) {
			myArray[i] = sc.nextInt();
		}
		int sum = 0;
		sorted(array);
		
		for(int i = 0; i < myArray.length; i++) {
			if (binSearch(array, myArray[i]) != -1) {
				sum++;
			}
		}
		
		System.out.println("5 문제 중 총 " + sum + "개 맞췄습니다.");
		
		sc.close();
		
	}
	public static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
	/**sorting method
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
}
