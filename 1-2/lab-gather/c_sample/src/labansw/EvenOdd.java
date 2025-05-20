package labansw;
import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("enter number:");
		number = input.nextInt();
		
		int check = number%2;
		
		switch (check) {
		case 0: 
			System.out.print("even");
			break;
		case 1:
		    System.out.print("odd");
		    break;
		}

	}

}
