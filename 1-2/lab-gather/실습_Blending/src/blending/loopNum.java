package blending;
import java.util.Scanner;

public class loopNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("enter num:");
		n = input.nextInt();
		
		int i = 10;
		int a=0;
		int b=0;
		
		//a<n=
		for ( b=0; b<=n; b++) { 
			if(a < i) { //column line
				System.out.print("\t" + b );
				a++;
			} else {
				a = 1 ; // loop start 1
				System.out.println("\t");
				System.out.print("\t" + b);
				
			}
				
			
		}

	}

}
