package labansw;
import java.util.Scanner;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1 =0;
       int n2=0;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("enter 2 number:");
       n1 = input.nextInt();
       n2 = input.nextInt();
       
       if( n1> n2) {
    	   System.out.print("left is more bigger!");
       } else if (n1 < n2){
    	   System.out.print("right is more bigger!");
       }else {
    	   System.out.print("same");
       }

  
	}

}
