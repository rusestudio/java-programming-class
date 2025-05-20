package hjyjavaw4;
import java.util.Scanner;

public class MaxPower { //Q8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 사용자로부터 자연수 입력 받기
        System.out.print("자연수 하나를 입력하시오: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        // 가장 큰 2의 거듭제곱수 찾기
        int maxPower = 1;
        while (maxPower * 2 <= n) {
            maxPower *= 2;
        }

        // 결과 출력
        System.out.println(n + "보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수 = " + maxPower);

        // Scanner 객체 닫기
        input.close();

	}

}
