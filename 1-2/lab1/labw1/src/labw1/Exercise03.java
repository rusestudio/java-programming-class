package labw1;
import java.util.Scanner; //scanner class 포함

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int degree =0;
		
		System.out.print("각도(degree)를 입력하세요: ");
		degree = input.nextInt();
		
		double rad = degree * (3.14/ 180);
		
		System.out.printf("라디안(rad): %.2f", rad);

	}

}
