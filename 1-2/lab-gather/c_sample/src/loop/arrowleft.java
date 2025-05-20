package loop;
import java.util.Scanner;

public class arrowleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        // Get the number of rows from the user
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int numRows = input.nextInt();

		        // Display the left arrow pattern
		        for (int i = 1; i <= numRows; i++) {
		            for (int j = 1; j <= numRows - i; j++) {
		                System.out.print(" ");
		            }
		            for (int k = 1; k <= i; k++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        for (int i = numRows - 1; i >= 1; i--) {
		            for (int j = 1; j <= numRows - i; j++) {
		                System.out.print(" ");
		            }
		            for (int k = 1; k <= i; k++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		   
	}

}
