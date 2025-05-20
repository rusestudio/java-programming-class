package functionprac;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		boolean done = false;
		while (!done) {
			printMenu(); //call a function
			int selection = input.nextInt();
		}
	}
	
	public static void printMenu() {
		System.out.println("음식 종류");
		System.out.println("ice-cream: 1");
		System.out.println("coffee: 2");
		System.out.println("beverage: 3");
		System.out.println("end: 4");
		System.out.println("번호 선택:");
return;
	}

}
