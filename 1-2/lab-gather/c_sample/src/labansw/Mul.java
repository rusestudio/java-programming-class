package labansw;
import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0;
	    int n2=0;
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("enter 2 number with 3 digit places:");
	    n1= input.nextInt();
	    n2= input.nextInt();
	    
	    int n_100;
	    int n_10;
	    int n_1;
	    
	    n_100= n2/100;
	    n_10 = (n2 % 100)/10;
	    n_1 = (n2 % 100)%10;
	    
	    System.out.println(n1*n_1);
	    System.out.println(n1*n_10);
	    System.out.println(n1*n_100);
	    System.out.println(n1*n2);
	    
	    
	
	}

}
