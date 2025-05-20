package week12;

import java.util.*;

public class WordGuessGame {

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

	}

	// 단어 추측 게임을 실행
	public void playGame() {

	}

	// 메인 메소드
	public static void main(String[] args) {
		WordGuessGame game = new WordGuessGame();
		game.playGame();
	}
}