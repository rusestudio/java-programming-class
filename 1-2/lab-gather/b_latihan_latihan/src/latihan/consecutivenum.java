package latihan;
import java.util.Scanner;


public class consecutivenum {

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
		
		System.out.println("is the numbers is consecutive?");
		System.out.println(consecutive(n1,n2,n3));
	}
	
	
	
	public static boolean consecutive(int n1, int n2, int n3) {
		
		int max_num = Math.max(n1, Math.max(n2, n3));
	    int min_num = Math.min(n1, Math.min(n2, n3));
	    int middle_num = n1+n2+n3 - max_num - min_num;
	    return (max_num - middle_num) == 1 && (middle_num - min_num == 1);
		
		
	}

}
