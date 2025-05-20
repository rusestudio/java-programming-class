package labansw;
import java.util.Scanner;

public class MaxMinFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("배열의 크기는:");
		size = input.nextInt();
		
		int [] number = new int [size];
		
		System.out.println("배열에 입력될 숫자를 입력:");
		
		for(int i=0; i< size; i++) {
			number[i] = input.nextInt();
		}
		
		int max = number[0]; 
		int min = number[0];
		
		for (int i = 1; i<size; i++) {
			if(max < number[i]) {
				max = number[i];
			}
			if (min > number[i]) {
				min = number[i];
			}
		}
		
		System.out.println("배열의 숫자중 최댓값은:" + max);
		System.out.println("배열의 숫자중 최솟값은:" + min);
		
		
	}

}
