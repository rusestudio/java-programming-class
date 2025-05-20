package loop;

public class doublenestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        for (int i = 3; i < 5; i++) {
		            for (int j = 1; j < 10; j++) {
		                for (int k = 1; k < 5; k++) {
		                    int result = i * j * k;
		                    System.out.print(result + " ");
		                }
		                System.out.println();
		            }
		            System.out.println();
		        }
		    
	}

}
