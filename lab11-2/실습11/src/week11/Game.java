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
		Random random = new Random();
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1;
		}
	}

	// 배열의 내용을 화면에 출력
	public void displayNumbers() {
		System.out.println("게임 시작! 기억하세요.");
		for(int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + " ");
		}
		
	}

	/**
	 * 사용자 입력을 받아서 answer 배열에 숫자를 저장(5개)
	 * countCorrectGuesses 메소드를 사용하여 answer 배열에 있는 숫자 중 맞힌 숫자 갯수를 구함
	 * countCorrectGuesses(answer) <- 얘를 출력해주자
	 */
	
	public void playGame() {
		Scanner input = new Scanner(System.in);
		int[] answer = new int[5];
		
		System.out.println("숫자를 하나씩 입력하세요: ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(i+1 + "번째 숫자: ");
			answer[i] = input.nextInt();
		}
		System.out.println(countCorrectGuesses(answer));
	}

	// 화면을 지우는 역할을 하는 가상의 메소드(print문 100번 출력)
	private void clearScreen() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}

	// 사용자가 입력한 숫자 중 맞춘 숫자 개수 계산후 반환
	private int countCorrectGuesses(int[] answer) {
		int count = 0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j< answer.length; j++) {
				if(numbers[i]==answer[j]) {
					count++;
					numbers[i]=0;
				}
			}
		}
		return count;
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
