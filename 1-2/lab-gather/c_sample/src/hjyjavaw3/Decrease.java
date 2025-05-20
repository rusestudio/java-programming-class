package hjyjavaw3;
import java.util.Scanner;

public class Decrease { //Q5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	      
	      System.out.print("양의 정수를 하나 입력하시오: ");
	      int n = input.nextInt();
	      int i = n;
	      
	      for(i=n; i>=0; i--) {
	         System.out.print(i + " ");
	      }
	      input.close();
	   }

	

}
