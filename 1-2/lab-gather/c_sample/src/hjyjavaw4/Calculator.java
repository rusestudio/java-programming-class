package hjyjavaw4;

import java.util.Scanner;

public class Calculator { //Q2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		float x;
		float y;
		String op;
		double result =0.0;
		
		System.out.print("두 수 입력:");
		x = input.nextFloat();
		y = input.nextFloat();
		
		System.out.print("연산(+ - * /):" );
		op = input.next();
		
		switch(op) {
		case ("+"):
			result = x + y;
		break;
		case ("-"):
			result = x -y;
		break;
		case("*"):
			result = x* y;
		break;
		case("/"):
			result= x/y;
			break;
		default:
			System.out.println("지원하지 않는 연산입니다.");
			System.exit(0);
		}
		
		System.out.println( x+"\s" + op+"\s" + y+"\s" + " = " + result);
	}

}
