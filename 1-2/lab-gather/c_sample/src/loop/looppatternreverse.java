package loop;

public class looppatternreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int i, j;
				
				for (i = 1; i <= 8; i++) {
					for (j = 8; j >= i; j--) {
						System.out.print(i);
					}
					System.out.println();
				}
			
	}

}
