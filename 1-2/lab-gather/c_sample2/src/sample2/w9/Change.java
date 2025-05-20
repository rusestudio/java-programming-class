package sample2.w9;

import java.util.Random;

public class Change {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("저징된 배열");
		
		int[] nums = new int[10];
		
		for(int i = 0; i < 10; i++) {
			nums[i] = ran.nextInt(10, 101);
		}
		for (int i:nums) {
			System.out.print(i + " ");
		}
		System.out.println("\n수정된 배열");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				nums[i] += 1;
			}
		}
		for (int i:nums) {
			System.out.print(i + " ");
		}
	} 
}
