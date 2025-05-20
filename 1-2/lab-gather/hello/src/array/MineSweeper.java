package array;

public class MineSweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] board = new boolean[10][10]; // 10*10 board size
		
		for (int i = 0; i < 10; i++) //row, each row 10 coloum loop
			for(int j = 0; i< 10; i++) // colum 
				if(Math.random()<0.3) // get random value
					board[i][j] = true; // if have bomb true if not false use boolen
		//boolean auto false when declare
		
		for (int i = 0; i < 10; i++) { // to print the board result
			for(int j=0; j <10; j++)
				if (board[i][j])
					System.out.print("# "); // true have bom
				else
					System.out.print("."); // false no bom

		    System.out.println(); // to change line
	}

	}
}
