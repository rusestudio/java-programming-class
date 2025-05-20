package hjyjavaw4;
import java.util.Scanner;

public class TaxCalculator { //Q6

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  final double TAX_RATE_LOW = 15.0 / 100.0;
	        final double TAX_RATE_MID = 24.0 / 100.0;
	        final double TAX_RATE_HIGH = 35.0 / 100.0;

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("소득(만원단위 정수): ");
	        double income = scanner.nextDouble();

	        double tax = 0.0;
	        if (income >= 0) {
	            if (income <= 4600) {
	                tax = income * TAX_RATE_LOW;
	            } else if (income <= 8800) {
	                tax = 4600 * TAX_RATE_LOW + (income - 4600) * TAX_RATE_MID;
	            } else {
	                tax = 4600 * TAX_RATE_LOW + 4200 * TAX_RATE_MID + (income - 8800) * TAX_RATE_HIGH;
	            }
	        }
	        
	        System.out.printf("소득세 = %.1f만원\n", tax);
	        scanner.close();

	}

}
