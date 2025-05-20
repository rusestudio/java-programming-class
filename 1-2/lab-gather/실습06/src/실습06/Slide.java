package 실습06;
import java.util.Scanner;

public class Slide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		char charArray[][] = new char[5][5]; //

		String temp =""; // save input temp 
		for(int i = 0; i < charArray.length; i++) {
			temp = input.next();            // to input 5 5
			for(int j = 0;j < temp.length(); j++) {
				charArray[i][j] = temp.charAt(j);

			}
		}

		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0;j < temp.length(); j++) {
				System.out.print(charArray[j][i]); // to print by col
		
	}

}
	}
}
