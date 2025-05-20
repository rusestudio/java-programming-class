package switchcase;
import java.util.Scanner;

public class simplecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scan = new Scanner(System.in);
		        double firstNumber, secondNumber, result = 0.0;
		        char arithmeticOperation;
		    
		        System.out.print("Please enter an arithmetic operation (+, -, *, /): ");
		        arithmeticOperation = scan.next().charAt(0);
		        System.out.print("Please enter your first number: ");
		        firstNumber = scan.nextInt();
		        System.out.print("Please enter your second number: ");
		        secondNumber = scan.nextInt();
		    
		        switch (arithmeticOperation) {
		            case '+' :
		                result = firstNumber + secondNumber; 
		                break;
		            case '-' :
		                result = firstNumber - secondNumber;
		                break;
		            case '*' : 
		                result = firstNumber * secondNumber;
		                break;
		            case '/' :
		                result = firstNumber / secondNumber;
		                break;
		            default:
		                System.out.print("Unknown arithmetic symbol");
		        }

		        System.out.print(firstNumber + " " + arithmeticOperation + " " + secondNumber + " = " + result);
		    }
		

}
