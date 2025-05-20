package sample2.w12;

import java.util.StringTokenizer;

public class SortAndSearch {
	public static void main(String[] args) {
		
		String str = "cake%apple%cherry%banana%pineapple%mango";
		
		StringTokenizer tokens = new StringTokenizer(str, "%");
		
		String[] arr = new String[6];
		
		int i = 0;
		
		System.out.print("배열에 저장한 토큰들 : ");
		while (tokens.hasMoreTokens()) {
			arr[i] = tokens.nextToken();
			System.out.print(arr[i] + " ");
			i++;
		}
		
		sort(arr);
		
		System.out.print("\n정렬된 배열 : ");
		printArr(arr);
		
		System.out.println();
		
		String key = "cherry";
		if (binSearch(arr, key) == -1) {
			System.out.println("없습니다!");
		} else {
			System.out.println("정렬된 배열에서 \"" + key + "\"가 저장된 인덕스 : " + binSearch(arr, key));
		}
	}
	/**
	 * printing method
	 * @param arr
	 */
	public static void printArr (String[] arr) {
		for (String i:arr) {
			System.out.print(i + " ");
		}
	}
	/**
	 * sorting method
	 * @param arr
	 */
	public static void sort(String[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	/**
	 * binary search method
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binSearch (String[] arr, String key) {
		int low = 0;
		int n = arr.length;
		int high = n - 1;
		int mid;
		
		while(high >= low) {
			mid = (high + low) / 2;
			if (arr[mid].equals(key)) {
				return mid;
			} else if (arr[mid].compareTo(key) > 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
