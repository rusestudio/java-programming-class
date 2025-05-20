package labansw;
import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int month = 0;
		
		System.out.print("enter  month:");
		month = input.nextInt();
		
		if(month >= 1 && month <= 12) {
			switch(month/3) {
			case 1:
				System.out.println("spring");
				break;
			case 2:
				System.out.println("summer");
				break;
			case 3:
			    System.out.println("autumn");
			    break;
			default:
				System.out.println("winter");
				break;
			}
		}else {
			System.out.println("enter between 12 month only");
		}
		
		
		
	}

}
