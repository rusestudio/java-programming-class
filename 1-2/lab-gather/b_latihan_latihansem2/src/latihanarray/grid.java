package latihanarray;

public class grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = new int[10][10];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				 System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}

	}

}
