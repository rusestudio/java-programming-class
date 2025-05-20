package hjyjavaw3;
import java.util.Scanner;

public class Multiples { //Q3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 0;
		   
		   Scanner input = new Scanner(System.in);
		   
		   System.out.print("어떤 수의 배수들을 출력할까요? ");
		   int n = input.nextInt();
		   
		   for(i=1; i<=100; i++) {
		      if(i%n==0) {
		      System.out.print(i + " ");   
		      }
		   }
		   
		   input.close();
		   
	}

}
