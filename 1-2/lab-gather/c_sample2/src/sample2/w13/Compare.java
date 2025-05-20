package sample2.w13;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("어떤 수를 나누겠습니까 ? ");
		int num = sc.nextInt();
		
		System.out.print("2의 몇 제곰으로 나누겠습니까 ? ");
		int twoPow = sc.nextInt();
		
		//먼저 bitwise
		System.out.println("시프트 연산 결과 : 몫은 " + (num >> twoPow) + " 입니다.");
		System.out.println("시프트 연산 결과 : 나머지는 " + (num & ((1 << twoPow) - 1)) + " 입니다.\n");
		
		//다음에는 일반
		System.out.println("나눗셈 연산자 : 몫은 " + (int)(num / Math.pow(2, twoPow)) + " 입니다.");
		System.out.println("나머지 연산자 : 나머지는 " + (num % (int)Math.pow(2, twoPow)) + " 입니다.");
		
		sc.close();
	}
}
