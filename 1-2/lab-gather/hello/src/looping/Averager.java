package looping;
import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while (true) {
			System.out.print("점수를 입력: ");
			int grade = input.nextInt();
			
			if (grade < 0)
				break;
			
			total += grade;
			count++;
			
		}
		
		System.out.println("평균은:" + total/count);

	}

}
