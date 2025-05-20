package 실습07;
import java.util.*;

public class Maxfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요: ");
        int length = input.nextInt();

        int[] numbers = new int[length];

        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        int max = numbers[0]; // 배열의 첫 번째 원소를 최댓값으로 초기화
        
		for (int i = 1; i < length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
        System.out.println("배열의 최댓값: " + max);


	}

}
