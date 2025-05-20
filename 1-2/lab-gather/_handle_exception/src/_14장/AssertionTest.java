package _14장;

import java.util.Scanner;

public class AssertionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a date: ");
		int date = input.nextInt();
		
		assert(date >= 1 && date <= 31) : "Invalid date: " + date; //check date // if wrong error
		System.out.printf("Date is valid: %d\n", date);// if correct print

	}

}
