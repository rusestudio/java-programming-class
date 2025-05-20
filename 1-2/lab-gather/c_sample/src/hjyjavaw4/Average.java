package hjyjavaw4;
import java.util.Scanner;

public class Average { //Q1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	      
	      double sum = 0.0;
	      int count = 0;
	      double n;
	      
	      System.out.println("enter 3 decimal number:");
	      n = input.nextDouble();
	      
	      while(n>0) {
	         sum = sum+n;
	         count++;
	         n = input.nextDouble();

	      }
	      if(count==0) {
	         System.out.println("양수가 하나도 입력되지 않았습니다.");
	      }
	      else {
	         double average = sum/count;
	         System.out.printf("평균 = %.2f",average);
	      }
	      

	}

}
