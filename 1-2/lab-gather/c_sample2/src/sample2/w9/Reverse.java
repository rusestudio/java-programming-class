package sample2.w9;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("다섯 개의 숫지를 입력하세요 : ");
		int [] nums = new int[5];
		for (int j = 0; j < nums.length; j++) {
			nums[j] = sc.nextInt();
		}
		System.out.println("저장된 배열 출력");
		for (int i:nums) {
			System.out.print(i + " ");
		}
		System.out.println("\n역수로 출력");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		sc.close();
	}
}
