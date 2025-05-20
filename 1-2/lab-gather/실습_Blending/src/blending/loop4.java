package blending;
import java.util.Scanner;


public class loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.println("enter n:");
        n = input.nextInt();
        
		for(int i=0; i<=n; i++) { //based on  value n one line 5*
			for(int p=0; p< i; p++) { //based on value i horivontal(y) 
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
