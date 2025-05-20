package hjyjavaw4;
import java.util.Scanner;
public class Power { //Q7

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("2의 몇 제곱까지 구할까요?: ");
	        int n = input.nextInt();
	        input.close();

	        for (int i = 0; i <= n; i++) {
	            long result = 1;
	            for (int j = 0; j < i; j++) {
	                result *= 2L;
	            }
	            System.out.println("2의  " + i + "제곱: " + result);
	        }

	}

}
