package blending;
import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		final double TAX_RATE_LOW = 15.0/100.0;
		final double TAX_RATE_MID = 24.0/100.0;
		final double TAX_RATE_HIGH = 35.0/100.0;
		
		double salary;
		double taxamt;
	

		System.out.println("수득(만원단위 정수):");
		salary = input.nextInt();
		
		if (salary >= 8800) {
			taxamt = (4600 * TAX_RATE_LOW);
			taxamt = 8800-4600 * TAX_RATE_MID;
			taxamt= salary- 8800 * TAX_RATE_HIGH;
		}else if(salary <= 8800) {
			//
		}else {
			//
		}
		
	}

}
