package array;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int STUDENTS = 5; //cannot change use final, declare varible = 5 so that if wanna change value can easily change.
		int total = 0;
		
		Scanner input  = new Scanner(System.in); // scanner
		
		int[] scores = new int[STUDENTS]; // array 
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하시오:");
			scores[i] = input.nextInt();
		}
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("평균 성적은 " + total/STUDENTS + " 입니다");

	}

}
