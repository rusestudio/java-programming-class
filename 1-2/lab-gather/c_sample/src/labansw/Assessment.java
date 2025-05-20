package labansw;
import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int math =0;
		int eng = 0;
		double avg =0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("math mark:");
		math = input.nextInt();
		
		System.out.print("eng mark:");
		eng = input.nextInt();
		
		avg = (math+eng) /2;
		
		if(avg>= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}
