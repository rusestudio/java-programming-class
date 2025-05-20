package hjyjavaw3;
import java.util.Scanner;

public class Increase { //Q4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	      
	      int i = 0;
	      
	      System.out.print("양의 정수를 하나 입력하시오: ");
	      int n = input.nextInt();
	      System.out.println("첫번째 방법");
	      
	      for(i=0; i<=n; i++){
	         System.out.print(i + "\t");
	         if(i%10==9) {                //boolen exp, when end of number id 9 it make new line
	            System.out.print("\n");
	         }
	      }
	      System.out.println("");

	      System.out.println("두번째 방법");
	      int count = 0;
	      
	      for(i=0; i<=n; i++){
	         System.out.print(i + "\t");
	         
	         count++;       //use count, everytime print +1
	         
	         if(count==10) {        // when count=10 make new line
	         System.out.print("\n");
	         count=0;               // then reset back to 1
	         }
	         
	      }
	      
	      input.close();
	      

	}

}
