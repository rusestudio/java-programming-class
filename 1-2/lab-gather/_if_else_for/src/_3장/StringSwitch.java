package _3장;
import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String month;
		
		System.out.print("월의 이름을 입력하시오:" );
		month = input.next();
		
		int monthNumber;
		
		switch(month) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
		   monthNumber = 2;
		   break;
		case "march":
			monthNumber = 3;
			break;
			default: monthNumber =0;
			break;
		} 
		
		System.out.println(monthNumber);
	}

}
