package 실습09;
import java.util.Scanner;
public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		MyMath obj = new MyMath();
		
		int b=0;
		int a=0;
	
		System.out.print("첫 번째 정수를 입력: ");
        a = input.nextInt();
		
		System.out.print("두 번째 정수를 입력: ");
        b = input.nextInt();
		
		System.out.println("두 정수의 합은: " + obj.add(a, b));//int type
		
		MyMath obj2 = new MyMath();
		double a2 =0;
		double b2=0;
		
		
		System.out.print("첫 번째 실수를 입력: ");
        a2 = input.nextDouble();
		
		System.out.print("두 번째 실수를 입력: ");
        b2 = input.nextDouble();
		
		System.out.println("두 실수의 합은" + obj2.add2(a2,b2));// double type
		
	}

}
