package 실습04;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number=0;
		int sum = 0;
		int count = 0;
		
		
		
		while(true) {
			System.out.printf("수를 입력(음수를 입력하면 종료):");
			number = input.nextInt();
			
			if (number < 0) {
				break;
			} else {
				sum+= number;
				count++;
			}
		}
		
		System.out.println("입력한 숫자 합은:" + sum + "입니다.");
		System.out.println("입력한 숫자 개수는:" + count + "입니다.");
	}

}
