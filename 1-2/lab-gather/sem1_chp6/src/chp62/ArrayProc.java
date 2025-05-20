package chp62;
import java.util.Scanner;

public class ArrayProc {
	
	public void getValues(int[] array) {
		Scanner input = new Scanner(System.in);
		
		for (int i =0; i < array.length; i++) {
			System.out.println("enter marks: ");
			array[i] = input.nextInt();
		}
	}
	
	public double getAverage(int[] array) {
		double total =0;
		
		for (int i=0; i< array.length; i++)
			total = total+array[i];
		return total/array.length;
	}

}
