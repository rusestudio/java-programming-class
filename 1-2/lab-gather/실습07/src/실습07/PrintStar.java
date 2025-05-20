package 실습07;
import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n; //row num
		
		
		System.out.print("숫자를 입력하세요:");
		n = input.nextInt();
		        int i, j, k =0;

		        for (i = 0; i < n; i++) { 
		            for (j = 0; j < i; j++) { 
		                System.out.print(" ");
		            }

		            for (k = 0; k < n*2-1-i*2; k++) { //row star
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        
		        for (i = n - 2; i >= 0 ; i--) {
		            for (j = 0; j < i; j++) {
		                System.out.print(" ");
		            }
		            for (k = 0; k <= n-(i*2-1); k++) { //
		                System.out.print("*");
		            }

		            System.out.println();
		        }
	}

}

	
