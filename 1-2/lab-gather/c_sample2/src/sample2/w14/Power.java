package sample2.w14;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑수를 입력하세요 (음이 아닌 정수): ");
		int base;
		do {
			base = sc.nextInt();
		} while (base < 0);
		
		System.out.print("지수를 입력하세요 (음이 아닌 정수): ");
		int expo;
		do {
			expo = sc.nextInt();
		} while (expo < 0);
		
		System.out.println(base + "의 " + expo + "승 = " + power(base, expo));
		
		sc.close();
	}
	
	public static int power(int n, int m) {
		if(n == 0) {
			return 0;
		}
		if(n == 1 || m == 0) {
			return 1;
		} else {
			return n * power(n, m - 1);
		}
	}
}
