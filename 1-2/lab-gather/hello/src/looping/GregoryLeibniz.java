package looping;
import java.util.Scanner;

public class GregoryLeibniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double divisor, divident, sum;
		int loop_count;
		
		divisor = 1.0;
		divident = 4.0;
		sum = 0.0;
		
		System.out.print("반복횟수:");
		loop_count = input.nextInt();
		
		while(loop_count>0) {
			sum = sum + divident/divisor;
			divident = -1.0*divident;
			divisor = divisor + 2;
			loop_count--;
		}
		System.out.println("Pi = " + sum);
		

	}

}
