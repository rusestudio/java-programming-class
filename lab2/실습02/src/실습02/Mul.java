package 실습02;
import java.util.Scanner; //scanner class 포함

public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n1 = 0 , n2 =0, result1, result2, result3, result4;
		
		System.out.print("숫자를 입력하세요(세 자리수 정수): ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		result1 = n1+n1+n1;
		result2 = (n1+n2)-(n2%n1);
		result3 = (n2/n1)*n1;
		result4 = n1*n2;
		 
	
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
