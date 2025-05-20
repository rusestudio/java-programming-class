package _3장;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("난수의 개수: " );
		int count = input.nextInt();
		int sum =0;
		
		for(int i =0; i<count; i++) {
			int number = generator.nextInt(100);
			sum += number;
		} 
		System.out.print("난수 "+ count + "개의 합은 " + sum);
	}
}
