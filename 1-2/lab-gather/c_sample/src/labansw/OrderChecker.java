package labansw;
import java.util.Scanner;

public class OrderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int size =0;
		
		System.out.print("배열 크기 입력:" );
		size = input.nextInt();
		
		String[] fruit = new String[size];
		
		for(int i= 0; i <size; i++) {
			System.out.print("과일 입력:");
			fruit[i]= input.next();
		}
		
		String fruit_check= "";
		int check = 0;
		
		System.out.print("주문할 과일 입력:" );
		fruit_check = input.next();
		
		for(int i = 0; i < size; i++) {
			if (fruit_check.equals(fruit[i])) {
				check =1;
				break;
			}
		}
		
		if(check ==1 ) {
			System.out.println(fruit_check +" 주문됐읍니다.");
		} else {
			System.out.println(fruit_check +" 주문 할 수 없습니다.");
		}
		
		
	}

}
