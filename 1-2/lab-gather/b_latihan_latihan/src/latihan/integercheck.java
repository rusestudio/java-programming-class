package latihan;
import java.util.Scanner;

public class integercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter integer:");
		int num = input.nextInt();
		
		System.out.println("are all integer are even number?");
		System.out.println(check(num));

	}
	
	public static boolean check(int num) {
		if(num%2 == 0) {
			return true;
		}
		return false;
	}
	
	
	

}
