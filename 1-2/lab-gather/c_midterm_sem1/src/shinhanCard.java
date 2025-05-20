
import java.util.Scanner;

public class shinhanCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//max one time = 1000000
		//max monthly payment = 5000000
		
		int transaction_number_monthly = 0; //= array size
		
		boolean done = false;
		while (!done) { // to check Q exit
		
		System.out.print("Enter number of transaction per month:");
		transaction_number_monthly = input.nextInt();
		
		int[] array_trans= new int[transaction_number_monthly];
		
		 System.out.print("Enter "+ transaction_number_monthly +" transaction amounts(KRW):");
			
	    //to check more than 1 mil
		for (int i = 0; i< transaction_number_monthly; i++) {
			array_trans[i]= input.nextInt();	
		}
		
		for(int i=0; i<array_trans.length; i++) {	
			if (array_trans[i] > 1000000) {
		System.out.println("There is transaction exceed 1mil. Enter again");
			} 
		}
		
		int min_trans=0;
		min_trans = array_trans[0];
		
		for(int i=0; i<array_trans.length; i++) {
			if (array_trans[i]< min_trans) {
				min_trans = array_trans[i];
			}
		}
		
		int max_trans=0;
		max_trans = array_trans[0];
		
		for (int i =0; i < array_trans.length; i++) {
		     if( array_trans[i] > max_trans) {
		    	 max_trans = array_trans[i];
				
			}
		}
		
	    int sum_trans=0;
	    
	    for(int i = 0; i< array_trans.length; i++) {
	    	sum_trans= sum_trans+ array_trans[i];
	    }
		
	    // to print
	    
	   System.out.println("Minimum payment:" + min_trans);
	   System.out.println("Maximum payment:" + max_trans);
	   System.out.println("Total payment amount for one month:" + sum_trans);
	   
		String cont;
		
		System.out.print("Do you want to continue running?(y/n):");
	    cont = input.next();
	    
	    if(cont.equals("y")) {
	    	System.out.println("Exit");
	         done = true;
	         break; 
	    } else {
	    	done = false;
	    }
	  
		
		}
		
	}

}
