package hello;
import java.util.Scanner; //scanner class 포함

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	Scanner input = new Scanner(System.in);
	int x; // save first number
	int y; // save sec number
	int sum; // save operation
	
	System.out.print("첫번째 숫자를 입력하시오:"); //입력 안내 출력
	x = input.nextInt(); //input
	
	System.out.print("두번째 숫자를 입력하시오:"); //입력 안내 출력
	y = input.nextInt();
	
	sum = x + y; //두 개의 숫자를 더한다
	
	System.out.println("sum:" + sum);
		
	}
	
}
