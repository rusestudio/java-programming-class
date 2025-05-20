package IfElse;
import java.util.Scanner; //scanner class 포함

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("정수를 입력하시오:");
		number = input.nextInt();

		if (number % 2 == 0) {
		    System.out.println("입력된 정순는 짝수이다");
	}  else {
            System.out.println("입력된 정수는 홀수이다");
}
		System.out.println("프로그램 종료");
	}
}


//check base on bit to decide the odd and even, the last big either 0 or 1