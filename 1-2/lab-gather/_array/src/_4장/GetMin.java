package _4장;

public class GetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prices[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 };
		int minimum;
		minimum = prices[0];
	
    for (int i = 1; i < prices.length; i++) {
	   if (prices[i] < minimum)
	    	minimum = prices[i];

          }
            System.out.print("최소값은 " + minimum);
 
	}

 }
