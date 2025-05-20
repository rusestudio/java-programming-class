package labansw;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int number = 0;
		
		System.out.print("삼각형 층 수 입력:");
		number  = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			for(int j= 1; j<= number-i;j++) {
				System.out.print(" ");
			}
			for(int p = 1; p <= i; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
