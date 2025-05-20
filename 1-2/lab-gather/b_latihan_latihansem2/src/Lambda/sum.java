package Lambda;

public class sum {
	
	interface SumCalculator {
	    int sum(int a, int b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SumCalculator sumCalculator = (x, y) -> x + y;
	        int result = sumCalculator.sum(7, 6);
	        System.out.println("Sum 7,6): " + result);
	        
		result = sumCalculator.sum(15, -35);
	        System.out.println("Sum 15, -35): " + result);

	}

}
