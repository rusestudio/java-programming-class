package sample2.w13;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("판별할 수를 입력하세요. ");
		int num = sc.nextInt();
		
		System.out.println("홀수 입니까 ? " + isOdd(num));
		sc.close();
	}
	/**
	 * 홀수인지 짝수인지 체크하는 함수
	 * @param n
	 * @return
	 */
	public static boolean isOdd (int n) {
		String bin = Integer.toBinaryString(n);
		
		if ((Integer.parseInt(bin) & 1) == 0) {
			return false;
		} else {
			return true;
		}
	}
}