package looping;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer;
		int guess;
		int tries=0;
		
		Random generator = new Random();
		answer = generator.nextInt(100) + 1;
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.print("정답 추측해 보세요:");
	        guess = input.nextInt();
	        tries++;
	        
	        if (guess > answer)
	        	System.out.println("제시한 저수가 높다");
	        if (guess < answer)
	        	System.out.println("제시한 정수가 낮다");
		} while (guess != answer);
		
         System.out.println("축하합니다. 시도횟수 =" + tries);		

	}

}
