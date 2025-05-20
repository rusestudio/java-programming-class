package sample2.w9;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int [] nums = new int [10];
		
		for (int i = 0; i < 10; i++) {
			nums[i] = ran.nextInt(101);
		}
		System.out.println("배열에 저징된 값");
		for (int i:nums) {
			System.out.print(i + " ");
		}
		
		int max = nums[9];
		int min = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("\n최대 값은 " + max + ", 최소 값은 " + min);
	}
}