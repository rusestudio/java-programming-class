package _3장;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("정수를 입력하시오:" );
		number = input.nextInt();
		
		if (number % 2 ==0) {
			System.out.println("입력된 정수는 짝수입니다.");
		}  else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
		System.out.println("프로그램이 종료뒤었습니다");
		
	}

}
