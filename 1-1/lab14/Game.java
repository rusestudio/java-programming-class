package 실습14;

import java.util.*;

public class Game {

    private static final int MAX_ATTEMPTS = 10;

    private int number1;
    private int number2;
    private int attemptsLeft;

    // 생성자: 게임 초기화 및 난수 생성
    public Game() {
        this.number1 = generateRandomNumber(); //gerate random no1
        this.number2 = generateRandomNumber();// generate random no2
        this.attemptsLeft = MAX_ATTEMPTS;
    }

    // 1부터 100까지의 난수를 생성하여 반환
    private int generateRandomNumber() {
    	Random random = new Random();
    	int number= random.nextInt(10);
		return number;
		
    }

    // 계산 게임을 실행
    public void playGame() {
    	System.out.println("암호 해독 게입에 오신 것을 환영합니다");
    	System.out.println("2자리 숫자 암호를 추측하세요. ");
    	
    	Scanner input = new Scanner(System.in);
    	
    	
    	for (int i =0; i< MAX_ATTEMPTS; i++) { //max=10
			System.out.print("암호를 입력하세요:");
			
			String guess = input.next();
			int guess1 = Integer.parseInt(String.valueOf(guess.charAt(0)));
			int guess2 = Integer.parseInt(String.valueOf(guess.charAt(1)));
			
			int answer1 = number1;
			int answer2 = number2;
			
			if (guess1 == answer1 && guess2== answer2) {
				System.out.println("정답입니다! 암호는 [" + answer1+","+ answer2+ "]였습니다.");
				break;
			}else if (guess1 == answer1 && guess2 != answer2)  {
				attemptsLeft--;
				System.out.println("틀렸습니다! 밎힌 숮자는 1개 이고 남은 기회: " + attemptsLeft);
			}else {
				attemptsLeft--;
				System.out.println("틀렸습니다! 밎힌 숮자는 0개 이고 남은 기회: " + attemptsLeft);
			}
			
			
			
			if (attemptsLeft==0) {
				System.out.println("기회를 모두 사용하였습니다. 암호는[" + answer1+","+ answer2+"]였습니다.");
			}
    	
    	}
    }

    // 메인 메소드
    public static void main(String[] args) {
        Game play = new Game();
        play.playGame();
    }
}