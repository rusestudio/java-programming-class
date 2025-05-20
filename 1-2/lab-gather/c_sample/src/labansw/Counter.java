package labansw;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int size = 0;
		
		System.out.print("enter array size:");
		size = input.nextInt();
		
		int [] number = new int[size];
		
		System.out.println("enter array number:" );
		for (int i=0 ; i < size; i++) {
			number[i] = input.nextInt();
		}
		
		int check =0;
		int count = 0;
		
		System.out.print("enter check number:");
		check = input.nextInt();
		
		for (int i= 0; i<size; i++) {
			if(check == number[i]) {
				count++;
			}
		}
		
		System.out.println("the number " + check + " enter is " + count + " times");
		
		
		
	}

}
