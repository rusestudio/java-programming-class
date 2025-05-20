package IfElse;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
       final int targetSales = 1000;
       int mySales;
       int bonus;
       String result; //저장 결과
       
       System.out.println("실적을 입력(단위 만원):");
       mySales = input.nextInt();
       
       if (mySales >= targetSales) {
       result = "실적 달성";
       bonus = (mySales - targetSales) / 10;
       
	}else {
		result = "실적 달성 못한";
		bonus = 0;
	}
 
       System.out.println(result + "\n\n" + "버너스:" + bonus);
       
	}
}
