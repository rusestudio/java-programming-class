package 실습03;
import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int month = 0;
		
		 System.out.print("현제 월을 입력:");
		 month = input.nextInt();
		 
		 
		 if (month >= 1 && month <= 12) {
		 switch (month) {
		 case 1:
		 case 12:
			 System.out.print("겨울");
			 break;
		 case 3:
		 case 4:
		 case 5:
			 System.out.print("봄");
			 break;
		 case 6:
		 case 7:
		 case 8:
			 System.out.print("여름");
			 break;
		 case 9:
		 case 10:
		 case 11:
			 System.out.print("가을");
			 break;
		 }
		 }else {
			 System.out.print("입력값이 잘못되었습니다.");
		 }
	}

}
