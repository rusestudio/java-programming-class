package 실습02;
import java.util.Scanner; //scanner class 포함

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n1 =0, n2=0, result =0;
		
		System.out.println("두 정수를 입력하세요:");
	    n1 = input.nextInt(); //input
	    n2 = input.nextInt(); //input
	    
	    result = n1 + n2;
	    
	    System.out.println(n1 + "과 " + n2 + "의 합은:" + result + "입니다");

	}

}
