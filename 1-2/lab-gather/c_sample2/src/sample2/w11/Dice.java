package sample2.w11;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		
		System.out.print("주사위를 몇 번 던지겠습니까 ? ");
		int times = sc.nextInt();
		
		if (times < 0) {
            System.out.println("던지는 횟수는 음수일 수 없습니다.");
            return;
        }

        int[] dice = new int[7]; // Indexes 0 through 6, ignore index 0
        for (int i = 0; i < times; i++) {
            int n = ran.nextInt(1,7);
            dice[n]++;
        }
		
		print(dice);
		sc.close();
		
	}
	public static void print (int[] arr) {
		System.out.println("1 횟수 : " + arr[1]);
		System.out.println("2 횟수 : " + arr[2]);
		System.out.println("3 횟수 : " + arr[3]);
		System.out.println("4 횟수 : " + arr[4]);
		System.out.println("5 횟수 : " + arr[5]);
		System.out.println("6 횟수 : " + arr[6]);
	}
}
