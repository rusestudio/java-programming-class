package _5장;
import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str;
		
		while(true) {
			System.out.print("문자열을 입력하세요:");
			str = input.next();
			
			if(str.equals("quit")== true)
				break;
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str + "은 'www'로 시작합니다.");
			} else {
				System.out.println(str + "은 'www'로 시작하지 않습니다.");
			}
		}
		
		
		

	}

}
