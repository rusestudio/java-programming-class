package exception;

import java.util.Scanner;

public class assertionTestt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter date:");
		int date = input.nextInt();
		
		assert(date >= 1 && date <=31) : "wrong date:" + date;
        System.out.println("the date:" + date);
				
				

	}

}
