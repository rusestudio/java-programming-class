package 실습12;

import java.util.*;

public class WordGuessGame {

	Scanner input = new Scanner(System.in);

	private static final String[] WORDS = {"apple", "banana", "cherry", "date", "elderberry"};
	private static final int MAX_ATTEMPTS = 3;

	private String chosenWord;
	private int attemptsLeft;

	// 생성자: 게임 초기화 및 단어 선택
	public WordGuessGame() {
		this.chosenWord = chooseRandomWord();
		this.attemptsLeft = MAX_ATTEMPTS;
	}

	// 단어 목록에서 랜덤으로 단어 선택
	private String chooseRandomWord() {
		Random random = new Random();
		int word = random.nextInt(WORDS.length); //0-4

		return WORDS[word];
	}

	// 단어 추측 게임을 실행
	public void playGame() {

		System.out.println("단어 추측 게임에 오신 것을 환영합니다. ");
		System.out.println("다음 단어중 하나를 추측하세요: [apple, banana, cherry, date, elderberry]");
		
		for (int i =0; i< MAX_ATTEMPTS; i++) {
			System.out.println("단어를 입력하세요:");
			String answer = input.next();
			if (answer.equals(chosenWord)) {
				System.out.println("정답입니다! 단어는 " + answer+"였습니다");
				break;
			} 
			else {
				attemptsLeft--;
				System.out.println("틀렸습니다. 남은 기회:"+ attemptsLeft);
			}
		}
		if (attemptsLeft==0) {
			System.out.println("기회를 모두 사용하였습니다. 단어는" + chosenWord+ "였습니다");
		}
		
		
	}


	// 메인 메소드
	public static void main(String[] args) {
		WordGuessGame game = new WordGuessGame();
		game.playGame();
	}
}