package 실습14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class game2 {
	
	private static final int CODE_LENGTH =2;
	private static final int MAX_ATTEMPTS = 10;
	
	private int[] secretCode;
	private int attempsLeft;
	private int hint = 0;
	
	public game2() {
		this.secretCode = generateSecretCode();
		this.attempsLeft = MAX_ATTEMPTS;	
	}
	
	private int[] generateSecretCode() {
		Random random = new Random();
		int[] code = new int[CODE_LENGTH];
		for (int i=0; i<CODE_LENGTH; i++) {
			code[i] = random.nextInt(10);
		}
		return code;
	}
	
	public void playGame() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("암호 해독 게입에 오신 것을 환영합니다");
    	System.out.println("2자리 숫자 암호를 추측하세요. ");
    	
    	while(attempsLeft > 0) {
    		System.out.print("암호를 입력하세요:");
			String guess = input.nextLine();
			
			if(guess.length() != CODE_LENGTH) {
				System.out.println("잘못된 입력입니다. 2자리 숫자를 입력하세요.");
				continue;
			}
			
			int[] guessArray = new int[CODE_LENGTH];
			for(int i=0; i< CODE_LENGTH; i++) {
				guessArray[i]= guess.charAt(i) - '0';
			}
			
			if (Arrays.equals(secretCode, guessArray)) {
				System.out.println("정답입니다! 암호는" + Arrays.toString(secretCode) +"였습니다.");
				break;
			}
			else {
				attempsLeft--;
				for(int i=0; i< CODE_LENGTH; i++) {
					if(secretCode[i]== guessArray[i])
						hint++;
				}
				System.out.println( "틀렸습니다! 밎힌 숮자는"+ hint+ " 이고 남은 기회: " + attempsLeft);
				hint =0;
			}
			
			if (attempsLeft ==0) {
				System.out.println("기회를 모두 사용하였습니다. 암호는" + Arrays.toString(secretCode)+"였습니다");
			}
    	}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    game2 play = new game2();
        play.playGame();
	}

}
