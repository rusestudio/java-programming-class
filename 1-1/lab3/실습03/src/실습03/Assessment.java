package 실습03;
import java.util.Scanner;
public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input = new Scanner(System.in);
		
		int math = 0;
		int english = 0;
		
		double avg = 0;
		
		System.out.println("수학 점수:");
		math = input.nextInt();
		
		System.out.println("영어 점수");
		english = input.nextInt();

		avg = (math + english) / 2.0;
		
		if (avg > 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	
		}

}
