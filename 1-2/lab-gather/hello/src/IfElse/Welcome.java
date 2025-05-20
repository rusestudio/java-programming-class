package IfElse;
import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Date date = new Date();
        int currentHour = date.getHours();
        
        System.out.println("현제 시간은" + date);
        if (currentHour < 11) {
        	System.out.println("good morning");
        } else if (currentHour < 15) {
        	System.out.println("good afternoon");
        } else if (currentHour < 20) {
        	System.out.println("good evening");
        } else 
        	System.out.println("good night");
        
	}

}
