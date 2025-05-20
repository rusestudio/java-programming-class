package labansw;
import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int number=0;
		int sum=0;
		
		
		
		System.out.print("enter number:");
		number= input.nextInt();
		
		for (int i = 1; i <=100; i++) {
			if (i % number == 0) {
				System.out.print(i+ " ");
				sum += i;
				
			}
		}
		System.out.println();
		System.out.println("1이상 100 이하 모든"+ number + "의 배수의 합은 " + sum+ "입니다.");
	}

}
