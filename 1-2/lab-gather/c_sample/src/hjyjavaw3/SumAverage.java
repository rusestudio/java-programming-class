package hjyjavaw3;
import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i = 0;
	      int accumulation = 0;
	      
	      Scanner input = new Scanner(System.in);
	      
	      System.out.print("정수 몇 개 더하시겠습니까?:");
	      
	      int n = input.nextInt();
	      
	      System.out.print("정수를 차례로 입력하시오: ");
	      
	      for(i=0; i<n; i++) {
	         accumulation = accumulation + input.nextInt();
	      }
	      System.out.println("정수의 합 = " + accumulation);
	      double m = (double)n;
	      double average;
	      average = accumulation/m;
	      System.out.printf("평균 = %.2f", average);
	      
	      input.close();
	      

	}

}
