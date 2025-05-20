package loop;

public class diamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    int i, j, rows = 8;

			    // upper pyramid
			    for (i = 0; i <= rows; i++) {
			      for (j = 1; j <= rows - i; j++) {
			        System.out.print(' ');
			      }
			      for (j = 1; j <= 2 * i - 1; j++) {
			        System.out.print('*');
			      }
			      System.out.print("\n");
			    }

			    // lower pyramid
			    for (i = rows - 1; i >= 1; i--) {
			      for (j = 1; j <= rows - i; j++) {
			        System.out.print(' ');
			      }
			      for (j = 1; j <= 2 * i - 1; j++) {
			        System.out.print('*');
			      }
			      System.out.print("\n");
			    }
			 

	}

}
