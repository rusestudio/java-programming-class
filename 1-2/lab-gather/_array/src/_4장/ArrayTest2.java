package _4장;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		final int STUDENTS = 5;
		int total = 0;
		
		int[] scores = new int [STUDENTS];
		
		for(int i =0; i<scores.length; i++) {
			System.out.print("성적을 입력하시오:" );
			scores[i] = input.nextInt();
		}
		
		for(int i=0; i < scores.length; i++) {
			total += scores[i];
		}
			System.out.println("평균 성적은 " + total/ STUDENTS + "입니다" );
		

	}

}
