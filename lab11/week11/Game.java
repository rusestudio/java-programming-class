package week11;

import java.util.*;

public class Game {

	private static final int ARRAY_SIZE = 5;
	private static final int MAX_NUMBER = 100;

	private int[] numbers; // 난수를 저장할 배열

	// 생성자: 배열 초기화 및 난수 생성
	public Game() {
		this.numbers = new int[ARRAY_SIZE];
		generateRandomNumbers();
	}

	// 배열에 1부터 100까지의 난수 생성하여 저장
	private void generateRandomNumbers() {
		
	}

	// 배열의 내용을 화면에 출력
	public void displayNumbers() {
		
	}

	/**
	 * 사용자 입력을 받아서 answer 배열에 숫자를 저장(5개)
	 * countCorrectGuesses 메소드를 사용하여 answer 배열에 있는 숫자 중 맞힌 숫자 갯수를 구함
	 * countCorrectGuesses(answer) <- 얘를 출력해주자
	 */
	
	public void playGame() {
		

	}

	// 화면을 지우는 역할을 하는 가상의 메소드(print문 100번 출력)
	private void clearScreen() {
		
	}

	// 사용자가 입력한 숫자 중 맞춘 숫자 개수 계산후 반환
	private int countCorrectGuesses(int[] answer) {
		
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.displayNumbers();
		try {
			Thread.sleep(3000); // 3초간 일시 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		game.clearScreen();
		game.playGame();
	}
}
