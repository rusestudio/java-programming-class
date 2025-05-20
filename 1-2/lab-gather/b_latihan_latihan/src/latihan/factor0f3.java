package latihan;
import java.util.Scanner;

public class factor0f3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter integer(-ve/+ve):");
		int num = input.nextInt();
		
		System.out.println("factor of 3 of the said integer:");
		factor(num);
	}
	
	public static void factor(int num) {
		System.out.print(num + "=");
		int result =num;
		while (result%3 ==0) {
			System.out.print("3* ");
			result = result /3;
		}
		System.out.print(result);
	} 

}
