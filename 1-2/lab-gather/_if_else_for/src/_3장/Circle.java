package _3장;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double denominator, numerator, sum;
		int loop_count;
		
		Scanner sc = new Scanner(System.in);
		
		denominator = 1.0;
		numerator = 4.0;
		sum = 0.0;
		
		System.out.print("반복횟수:");
		loop_count = sc.nextInt();
		
		while (loop_count > 0) {
			sum = sum + numerator / denominator;
			numerator = -1.0 * numerator;
			denominator = denominator + 2.0;--loop_count;
		}
		System.out.println("Pi = " + sum);

	}

}
