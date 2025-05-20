package loop;

public class treepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int n = 10, i, j, k;

				for (i = 0; i < n; i++) {
					for (j = 1; j <= n - i; j++) {
						System.out.print(" ");
					}
					System.out.print("*");
					for (k = 0; k <= i-1; k++) {
						System.out.print("|");
					}
					for (j = 1; j < i; j++) {
						System.out.print("|");
					}
					
					if (i > 0) {
						System.out.print("*");
					}
					System.out.println();
				}
			

	}

}
