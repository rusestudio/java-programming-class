package loop;
import java.util.Scanner;

public class numbertriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int i, j, k = 1;
				Scanner reader = new Scanner(System.in);

				System.out.print("Enter number of rows of floyd`s trangle: ");
				int n = reader.nextInt();
				reader.close();
				
				for (i = 1; i <= n; i++) {
					for (j = 1; j <= i; j++) {
						System.out.print(k + " ");
						k++;
					}
					System.out.println();
				}
			
	}

}
