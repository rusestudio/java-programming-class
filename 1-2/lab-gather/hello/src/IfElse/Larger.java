package IfElse;
import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    int x, y, max;
    
    System.out.println("첫번째 정수:");
    x = input.nextInt();
    
    System.out.println("두번째 정수:");
    y = input.nextInt();
    
    if (x > y) {
       max = x;
    } else {
    	max = y;
    }
    
    System.out.println("큰 수는:" + max);
	}

}
