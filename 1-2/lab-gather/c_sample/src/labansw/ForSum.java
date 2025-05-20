package labansw;
import java.util.Scanner;

public class ForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input = new Scanner(System.in);
		
		int number =0; 
		int sum =0;
		
		System.out.print("enter number:");
		number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			sum+= i;
		}
		System.out.print(sum);
		
	}

} //30
//1+2+3+....30=465;
