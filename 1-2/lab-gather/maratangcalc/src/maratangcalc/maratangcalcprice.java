package maratangcalc;
import java.util.Scanner;
 
public class maratangcalcprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     String menu="";
     float weight=0;
     float price=0;
     
     Scanner input = new Scanner(System.in);
     
     boolean done = false;
	 while (!done) { // 완료가 아닌 동안 반복
		 
      System.out.print("메뉴 입력(종료 시:4):" );
	  menu = input.next();
	     
	  System.out.print("무게 입력 gram(종료 시:0):" );
	  weight = input.nextFloat(); 
		 
	  switch (menu) {
	     case "maratang","마라탕":
	    	 price = (weight * 70);
	    	 if(weight>=100 && price>=7000) {
	    	 System.out.println("감삽니다, 가격은 "+ price +"원");
	    	 }else {
	    		 System.out.println("죄송합니다. 마라탕은 7000원 부터 주문 가능합니다.");
	    	 }
	    	 System.out.println();
	    	 break;
	     case "marashanguo","마라샹궈":
	    	 price = (weight * 150);
	    	 if(weight>=100 && price>=15000) {
	    	 System.out.println("감삽니다, 가격은 "+ price + "원" );
	    	 
	    	 }else {
	    		 System.out.println("죄송합니다. 마라탕은 15000원 부터 주문 가능합니다");	
	    	 }
	    	 System.out.println();
	    	 break;
	     case "kubao","꿔바로우":
	    	 price = (weight * 120);
	    	 if(weight>=100 && price>=12000) {
	    	 System.out.println("t감삽니다, 가격은 "+ price +"원" );
	    	 
	    	 }else {
	    		 System.out.println("죄송합니다. 마라탕은 12000원 부터 주문 가능합니다");
	    	 }
	    	 System.out.println();
	    	 break;
	     case "4":
	    	 //to make weight not ask
	         System.out.println("감사합니다.요리 시작합니다.");
	         done = true;
	         break;
	     default:
	         System.out.println("메뉴가 잘 못 입력했습니다."); 
	         System.out.println();
	  }
	 }
     input.close();
    
	}

}
