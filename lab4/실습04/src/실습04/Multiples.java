package 실습04;
import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int n = 0;     //n*number
		int sum = 0;
		int n2=0;


		System.out.print("숫자를 입력하세요:");
		n = input.nextInt();

		for(int i=1; i <= 100; i++) { //1~100
				if(i%n ==0){
					sum += i;
					System.out.println(i);
				
				}
			}


		System.out.println("1이상 100 이하의 모든" + n + "배수의 합은"  + sum + "입니다");


		}
	
}
