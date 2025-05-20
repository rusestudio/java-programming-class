package array;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = new char[3][3];
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) //row  
			for(int j = 0; j< 3; j++) //colum
				board[i][j] = ' ';
		
		do {
			for(int i =0; i<3; i++) { // to draw the board
				System.out.println(" " + board[i][0] + "| " +
			    board[i][1] + "| " + board[i][2]);
				if(i!= 2)
					System.out.println("--|--|--"); // when not 2 so just draw this
			}
			
			System.out.print("다음 수의 좌표를 입력하시오:");
			x = input.nextInt();  // better to check x>=0 && x<=2  input row
			y = input.nextInt();  // check y>=0 && y<=2 input colum
			
			if (board[x][y] != ' ') { //declare space tht user can enter, if  not empty
				System.out.println("잘못된 위치"); // print this
				continue;
			} else // else
				board[x][y] = 'X'; // if empty space then X get draw
			
			int i=0, j=0;
			for (i = 0; i < 3; i++) { // computer enter space
				for(j =0; j <3; i++)
					if (board[i][j]==' ')
						break;
				if(j<3 && board[i][i]== ' ')// when find o space use for break
					break;
			}
			
			if (i <3 && j <3)
				board[i][i]= 'O'; // computer mark 0
		} while(true);
	

	}

}
