package loop;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int a = 5, b = 7, c1 = 0, c2 = 0;

		        for (int i = 20; i > a; i--) {
		            c1++;
		            for (int j = 0; j < b; j++) {
		                c2++;
		                if (i == j) {
		                    System.out.println("How many times the loops are run?");
		                    System.out.print("first loop: " + c1 + "\nsecond loop: " 
		                            + c2 + " (" + c1 + " * " + b + ")");
		                }
		            }
		        }
		    
	}

}
