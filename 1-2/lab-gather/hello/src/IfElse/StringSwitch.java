package IfElse;
import java.util.Scanner;


public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input = new Scanner(System.in);
         
         String month;
         
         System.out.println("월의 이름을 입력:");
         month = input.next();
         
         int monthNumber;
         
         switch (month) {
         case "january":
        	 monthNumber = 1;
        	 break;
         case "february":
        	 monthNumber = 2;
        	 break;
         case "march":
        	 monthNumber = 3;
        	 break;
         case "april":
        	 monthNumber = 4;
        	 break;
         case "may": 
        	 monthNumber = 5;
        	 break;
         case "june": 
        	 monthNumber = 6;
        	 break;
         case "july": 
        	 monthNumber = 7;
        	 break;
         case "august":
        	 monthNumber = 8;
        	 break;
         case "september":
        	 monthNumber = 9;
        	 break;
         case "october": 
        	 monthNumber = 10;
        	 break;
         case "november":
        	 monthNumber = 11;
        	 break;
          default:
        	 monthNumber = 12;
             break;
         }
	
         System.out.println(monthNumber);
	
	}

}
