package sample2.w9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner sc = new Scanner(new File("D:/java/test.txt"));
		PrintWriter out = new PrintWriter("D:/java/result.txt");
		
		System.out.println("저징된 배열");
		int[] nums = new int[5];
		
		int i = 0;
		while(sc.hasNextInt()) {
			nums[i] = sc.nextInt();
			i++;
		}
		for (int j:nums) {
			System.out.print(j + " ");
		}
		int sum = 0;
		for (int j = 0; j < nums.length; j++) {
			sum += nums[j];
		}
		System.out.println("\n합은 : " + sum + "\n평균 : " + (int)(sum / 5));
		
		out.println("합은 : " + sum + "\n평균 : " + (int)(sum / 5));
		
		sc.close();
		out.close();
	} 
}
