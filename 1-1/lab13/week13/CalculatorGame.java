package week13;

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
        
    }

    // 계산 게임을 실행
    public void playGame() {
        
    }

    // 메인 메소드
    public static void main(String[] args) {
        CalculatorGame game = new CalculatorGame();
        game.playGame();
    }
}