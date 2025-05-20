package _3장;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int answer =59;
		int guess;
		
		int tries = 0;
		
		do {
			System.out.print("정답으 추측하여 보시오:" );
			guess = input.nextInt();
			tries++;
			
			if (guess > answer)
				System.out.print("제시한 정수가 높습니다." );
			if (guess < answer)
				System.out.print("제시한 정수가 낮습니다." );
		} while (guess !=answer);
		
		System.out.print("축하합니다. 시도 휫수=" + tries );

	}

}
