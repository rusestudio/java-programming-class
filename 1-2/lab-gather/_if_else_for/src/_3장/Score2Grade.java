package _3장;
import java.util.*;

public class Score2Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input  = new Scanner(System.in);
		
		int score, number;
		char grade;
		
		System.out.print("성적을 입력하시오:" );
		score = input.nextInt();
		
		number = score/10;
		
		switch (number) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;		
		}
		System.out.print("학점: " + grade);

	}

}
