package sample2.w13;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2의 몇 제곱을 구하시겠습니까 ? ");
		int num = sc.nextInt();
		
		System.out.println("정답은 " + (2 << (num - 1)) + " 입니다.");
	}
}