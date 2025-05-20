package 실습14;

import java.util.*;

public class CalculatorGame {

    private static final int MAX_ATTEMPTS = 10;

    private int number1;
    private int number2;
    private int attemptsLeft;

    // 생성자: 게임 초기화 및 난수 생성
    public CalculatorGame() {
        this.number1 = generateRandomNumber();
        this.number2 = generateRandomNumber();
        this.attemptsLeft = MAX_ATTEMPTS;
    }

    // 1부터 100까지의 난수를 생성하여 반환
    private int generateRandomNumber() {
    	Random random = new Random();
    	int number= random.nextInt(100)+1;
		return number;
		
    }

    // 계산 게임을 실행
    public void playGame() {
    	System.out.println("계산 게임에 오신 것을 환영합니다! ");
    	System.out.println("다음 두 숫자의 합을 맞추세요 ");
    	
    	Scanner input = new Scanner(System.in);
    	
    	for (int i =0; i< MAX_ATTEMPTS; i++) { //max=10
			System.out.print("합을 입력하세요:");
			int sum = input.nextInt();
			int answer = number1+number2;
			if (sum == answer) {
				System.out.println("정답입니다! 합은 " + answer+ "였습니다.");
				break;
			} else if (sum >answer) {
				attemptsLeft--;
				System.out.println("틀렸습니다! 정답은 더 작은 숫자입나다. 남은 기회: " + attemptsLeft);
			}else  {
				attemptsLeft--;
				System.out.println("틀렸습니다! 정답은 더 큰 숫자입나다. 남은 기회: " + attemptsLeft);
			}
			
			if (attemptsLeft==0) {
				System.out.println("기회를 모두 사용하였습니다. 합은 " + answer+ "였습니다.");
			}
    	
    	}
    }

    // 메인 메소드
    public static void main(String[] args) {
        CalculatorGame game = new CalculatorGame();
        game.playGame();
    }
}