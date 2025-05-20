package hjyjavaw3;
import java.util.Scanner;

public class Decrease2 { //Q6

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	      
	      System.out.print("양의 정수를 하나 입력하시오: ");
	      int n = input.nextInt();
	      int i=n;
	      System.out.println("첫번째 방법");
	      for(i=n; i>=0; i--) {
	         System.out.print(i + "\t");
	         if((n-i+1)%10==0) {
	            System.out.print("\n");
	         }
	      }
	      System.out.println("");
	      System.out.println("두번째 방법");
	      int count=0;
	      for(i=n; i>=0; i--) {
	       System.out.print(i + "\t");
	       count++;
	       if(count==10) {
	          System.out.print("\n");
	          count=0;
	       }
	      }
	       input.close();

	}

}
