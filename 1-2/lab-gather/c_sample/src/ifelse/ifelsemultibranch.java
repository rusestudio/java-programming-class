package ifelse;
import java.util.Scanner;

public class ifelsemultibranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scan = new Scanner(System.in);
		        int firstNumber, secondNumber;

		        System.out.print("Please enter first number: ");
		        firstNumber = scan.nextInt();
		        System.out.print("Please enter second number: ");
		        secondNumber = scan.nextInt();

		        if (firstNumber > secondNumber) {
		            System.out.print(firstNumber + " > " + secondNumber);
		        } else if (firstNumber < secondNumber) {
		            System.out.print(firstNumber + " < " + secondNumber);
		        } else {
		            System.out.print(firstNumber + " = " + secondNumber);
		        }
		   
	}

}
