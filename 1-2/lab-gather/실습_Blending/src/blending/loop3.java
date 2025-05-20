package blending;
import java.util.Scanner;

public class loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n; // n must n-1 = to get star get reduce each time
		
		System.out.println("enter n:");
		n = input.nextInt();
		
		int n1 = n-1;
		
		for(int i=0; i<n; i++) {
			for(int p=0; p<n1; p++) {
				System.out.print(" ");
			}
			for(int q=0; q<n-n1; q++) {
				System.out.print("*");
			}
			System.out.println();
			n1--;
	}
}}