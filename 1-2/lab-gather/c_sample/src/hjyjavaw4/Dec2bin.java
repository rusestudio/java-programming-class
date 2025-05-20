package hjyjavaw4;
import java.util.Scanner;

public class Dec2bin { //Q9

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // 사용자로부터 자연수 입력 받기
        System.out.print("자연수 하나를 십진수로 입력하시오: ");
        int n = scanner.nextInt();

        // 10진수를 2진수로 변환하여 출력
        if (n == 0) {
            // 입력값이 0인 경우 바로 "0"을 출력
            System.out.println("0");
        } else {
            int power = 1;
            // n보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수 찾기
            while (power * 2 <= n) {
                power *= 2;
            }

            // 10진수를 2진수로 변환하여 출력
            while (power > 0) {
                if (n < power) {
                    // 현재 거듭제곱수가 n보다 크면 0 출력
                    System.out.print("0");
                } else {
                    // 현재 거듭제곱수가 n보다 작거나 같으면 1 출력하고 n에서 거듭제곱수를 뺌
                    System.out.print("1");
                    n -= power;
                }
                // 다음으로 작은 거듭제곱수로 이동
                power /= 2;
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close(); // 스캐너 닫기

	}

}
