package latihan;
import java.util.Scanner;

public class getsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter num1: ");
		int num1 = input.nextInt();
		
		System.out.println("enter num2: ");
		int num2 = input.nextInt();
		
		System.out.println("Total: " + getTotal(num1,num2));
	    

	}
	
	
	public static int getTotal (int num1, int num2) {
		int total =0;
		total = num1+num2;
		return total;
		
		
		
	}

}
