package looping;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요:" );
		int n = input.nextInt();
		
		System.out.println(n + "의 약수는 다음과 같아.");
		
		for( int i = 1; i <=n; ++i) {
			if( n % i == 0)
				System.out.print(" " + i);
		}

	}

}
