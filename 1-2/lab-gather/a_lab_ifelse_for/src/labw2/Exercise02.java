package labw2;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("높이를 입력하세요: " );
		int rows = input.nextInt();

		for (int i = 1; i <= rows; i++) {

			int numberOfWhiteSpaces = rows - i;

			for (int j = 0; j < numberOfWhiteSpaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print(i%10 + " ");
			}

			System.out.println();
		}


	}
}
		