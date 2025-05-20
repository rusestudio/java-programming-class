package hjyjavaw3;
import java.util.Scanner;

public class SumAverage2 { //Q8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	      
	      System.out.println("평균을 구하는 프로그램");
	      System.out.println("양의 정수를 여러 개 입력하시고");
	      System.out.println("입력을 마치려면 0 이하 정수를 입력하시오:");
	      
	       boolean end = false;
	      int n;
	      int sum = 0;
	      int count = 0;
	      
	      while(true) {
	         n = input.nextInt();
	         if (n>=0 ) {
	            sum = sum + n;
	            count++;
	         }
	         else break;
	      }
	      
	      
	      System.out.println("입력된 0 이상 정수 갯수 = " + count);
	      
	      if(sum!=0) {
	         System.out.println("정수의 합 = " + sum);
	         double average;
	         average = (double)sum/(double)count;
	         
	         System.out.printf("평균 = %.2f",average);
	      }
	      
	      
	      
	      input.close();
	      

	}

}
