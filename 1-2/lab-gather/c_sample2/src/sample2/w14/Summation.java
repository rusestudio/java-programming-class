package sample2.w14;

import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 n을 입력하세요 : ");
		int n = sc.nextInt();
		
		System.out.println("RecursionSum = " + RecursionSum(n) + "\nloopSum = " + loopSum(n));
		
		sc.close();
	}
	/**simply calculates sum using "for" loop
	 * 
	 * @param n
	 * @return sum
	 */
	public static int loopSum (int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	/**calculates sum using recursion method
	 * 
	 * @param n
	 * @return 
	 */
	public static int RecursionSum (int n) {
		if (n == 1) {
			return 1;//여기에서 종료한다
		} else {
			return n + RecursionSum(n - 1);
		}
	}
}
