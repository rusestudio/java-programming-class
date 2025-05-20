package looping;
import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int i = 1;
		System.out.print("구구단 주에서 출력 하고 싶은 단:");
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		while (i <= 9) {
			System.out.println(n + "*" + i + "=" + n*i);
			i++;
		}
		
		
		
		

	}

}
