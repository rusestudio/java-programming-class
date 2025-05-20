package labw1;
import java.util.Scanner; //scanner class 포함

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n=0;
		int total=0;
		
		System.out.print("숫자를 입력하세요: ");
		n = input.nextInt();
		
		total = n * (n+1)/2;
		System.out.print("1부터"   + n+"까지의 합은 " + total + " 입나다.");
		
		
	}

}
