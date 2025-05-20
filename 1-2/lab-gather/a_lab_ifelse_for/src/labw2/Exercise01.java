package labw2;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int num;

		do {
			System.out.print("점수를 입력하세요: ");
			num = input.nextInt();

			// Exit 0 or -ve
			if (num <= 0) {
				System.out.print("종료");
				break;
			}

			// string to keep zeros
			String numStr = Integer.toString(num);
			StringBuilder reversedStr = new StringBuilder(numStr).reverse();

			// Add spaces
			for (int i = 0; i < reversedStr.length(); i++) {
				System.out.print(reversedStr.charAt(i));
				if (i < reversedStr.length() - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();  

		} while (num > 0);

	}

}  

