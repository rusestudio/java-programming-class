package IfElse;
import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// + input 윤년 체크 in case 2 
		//if (year % 4 ==0)
		//days = 29;
	//else
		//days = 28
		 Scanner input = new Scanner(System.in);
		 
		 int month;
		 int year;
		 int days = 0;
		 
		 System.out.print("일수를 알고 싶은 월을 입력:");
		 month = input.nextInt();
		 
		 System.out.print("년도를 입력:");
		 year = input.nextInt();
		 
		 switch (month) {
		 case 4:
		 case 6:
		 case 9:
		 case 11:
			 days = 30;
			 break;
		 case 2:
		 if (year % 4 == 0)
			 days = 29;
		 else
			 days = 28;
		 break;
		 default:
			 days = 31;
			 break;
		 }
			 
		 
		 System.out.println("월의 날순: " + days);
		
		 
	}

}
