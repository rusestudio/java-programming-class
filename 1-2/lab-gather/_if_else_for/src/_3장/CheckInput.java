package _3장;
import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int month;
		
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: " );
			month = input.nextInt();
		} while (month < 1 || month > 12);
	
	System.out.print("사용자가 입력한 월은 " + month );

}}
