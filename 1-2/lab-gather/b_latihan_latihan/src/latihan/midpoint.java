package latihan;
import java.util.Scanner;

public class midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		int n1=0;
		int n2=0;
		int n3=0;
		
		System.out.print("enter integer 1:");
		n1 = input.nextInt();
		
		System.out.print("enter integer 2:");
		n2 = input.nextInt();
		
		System.out.print("enter integer 3:");
		n3 = input.nextInt();
		
		System.out.println("is the numbers is midpoint?");
		System.out.println(midpoint(n1,n2,n3));

	}
	
	public static boolean midpoint(int n1, int n2, int n3) {
		
		boolean midp_n1= (n2 + n3 == 2 * n1);
		boolean midp_n2= (n1 + n3 == 2 * n2);
		boolean midp_n3= (n1 + n2 == 2 * n3);
		
		return midp_n1 || midp_n2 || midp_n3;
		
		
	}
	
	

}
