package loop;

public class trianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int rows = 8;

		        // Print the first half of the pattern
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }

		        // Print the second half of the pattern
		        for (int i = rows - 1; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }
		    


	}

}
