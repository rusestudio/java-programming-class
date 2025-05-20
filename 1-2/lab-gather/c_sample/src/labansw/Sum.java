package labansw;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		int number =0;
		int sum = 0;
		int count = 0;
	
		while(true) {
			System.out.print("enter number(positive number only): ");
			number = input.nextInt();
			
			if(number < 0 ) {
				break;
			}
	         else {
				sum+= number;
				count++;
			}
		}
	
		System.out.println("sum:"+ sum);
		System.out.println("entered number:" + count);
	}

}
