package functionprac;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		boolean done = false;

		while(!done) {
			printMenu();
			int selection = input.nextInt();
		
		
		switch(selection) {
		case 1:
			printIceCreamMenu();
			int ice = input.nextInt();
			System.out.println( ice +"선택, 감사합니다.");
		break;
		case 2:
			printCoffeeCreamMenu();
			int coffee = input.nextInt();
			System.out.println( coffee +"선택, 감사합니다.");
        break;
	    case 3:
		    printDrinkMenu();
		    int drink = input.nextInt();
		    System.out.println( drink +"선택, 감사합니다.");
	    break;
		
		
		default:
			System.out.println("감사합니다. 거래가 종료합니다.");
			done=true;
			break;
		}}
		//System.out.println("감사합니다. 거래가 종료합니다.");
	}


	public static void printMenu() {
		System.out.println("음식 종류");
		System.out.println("아이스크림: 1");
		System.out.println("커피: 2");
		System.out.println("음료: 3");
		System.out.println("종료: 4");
		System.out.print("번호 선택:");
		return;
	}


   public static void printIceCreamMenu() {
	   System.out.println("아이스크림 종류");
	   System.out.println("바날라(1000원): 1");
	   System.out.println("아몬드(1400원): 2");
	   System.out.println("딸기(1400원): 3");
	   System.out.println("호두(1400원): 4");
	   System.out.print("번호 선택:");
	return;
}

   public static void printCoffeeCreamMenu() {
		System.out.println("커피 종류");
		System.out.println("아메리가노(1000원): 1");
		System.out.println("에스프레소(1400원): 2");
		System.out.println("카페라떼(1400원): 3");
		System.out.print("번호 선택:");
		return;
	}
   
   public static void printDrinkMenu() {
		System.out.println("음료 종류");
		System.out.println("생수(1000원): 1");
		System.out.println("오렌지쥬스(1400원): 2");
		System.out.println("망고쥬스(1400원): 3");
		System.out.println("우유(1400원): 4");
		System.out.print("번호 선택:");
		return;
	}
   
   
   
}



