package labansw;
import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r =0;
		final double pi = 3.14;
		double result = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter circumference:");
		r = input.nextInt();
		
		result= 4.0/3.0*pi*r*r*r;
		
		System.out.printf("volume for %d circumference is: %.2f",r,result);
		
	}

}
