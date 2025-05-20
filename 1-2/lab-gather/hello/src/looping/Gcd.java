package looping;
import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x,y,r;
		
		System.out.print("두개의 정수를 입력하세요 (큰수, 작은수):");
		x = input.nextInt();
		y = input.nextInt();
		
		while (y != 0) {
			r = x%y;
			x = y;
			y = r;
			
		}

		System.out.println("최대 공약수는: " + x);
	}

}
