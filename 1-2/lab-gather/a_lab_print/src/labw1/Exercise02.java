package labw1;
import java.util.Scanner; //scanner class 포함

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int seconds =0;
		
		System.out.print("값을 입력하세요(단위:초) : ");
		seconds = input.nextInt();
		
		int s = seconds % 60;
		int h = seconds / 60;
		int m = h% 60;
		h = h/60;
		
		System.out.print(h + "시간 " + m + "분 " + s + "초");
		
		

	}

}
