package latihan;
import java.util.Scanner;

public class firstdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter integer(-ve/+ve):");
		int num = input.nextInt();
		System.out.println("the first digit is:");
		System.out.print(digit(num));
		
		
	}
	
	public static int digit(int num) {
		
		int result = 10;
		while(num/result!=0) {
			result = result*10;
			
			
		}
		return Math.abs(num/(result/10));
	}
	

}
