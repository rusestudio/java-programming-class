package hello2chp5;
import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("문자열 입력: ");
			str = input.next();
			
			if (str.equals("quit")== true)
				break;
			if (str.matches("^www\\.(.+)")) {
				System.out.println(str + " start with www");
			} else {
				System.out.println(str + " did not start with www");
			}
		}
		
		
		

	}

}
