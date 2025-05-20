package hjyjavaw3;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	      
	      System.out.println("표를 인쇄합니다.");
	      System.out.print("행을 몇 개 만들까요 row: ");
	      int row = input.nextInt();
	      System.out.print("열을 몇 개 만들까요? column: ");
	      int column = input.nextInt();
	      
	      int i=0;
	      int n=0;
	      
	      for(n=0; n<row; n++) {
	         for(i=0; i<column; i++) {
	            System.out.print("(" + n + ", " + i + ")   ");
	         }
	         System.out.println("");
	      }

	}

}
