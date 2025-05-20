package _4장;
import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[3][3];
		
		 int x, y;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 for (int i = 0; i < 3; i++)
		 for (int j = 0; j < 3; j++)
			 
		 board[i][j] = ' ';

		 do {
			 for (int i = 0; i < 3; i++) {
				 System.out.println("  " + board[i][0] + "|  " +
						 board[i][1] + "|  " + board[i][2]);
				 if (i != 2)
					 System.out.println("---|---|---");
			 }
			
			 
			 System.out.print("다음 수의 좌표를 입력하시오: ");
			 x = scan.nextInt();  
			 y = scan.nextInt(); 
			
			 if (board[x][y] != ' ') { // 사용자가 놓을 자리 결정
				 System.out.println("잘못된 위치입니다. ");
				 continue;
			 } else
				 board[x][y] = 'X'; // marked by the user

				 int i = 0, j = 0;
				 
			 for (i = 0; i < 3; i++) { // 컴퓨터가 놓을 자리 결정
				 for (j = 0; j < 3; j++)
					 if (board[i][j] == ' ')
						 break;
				 if (j < 3 && board[i][j] == ' ') // j < 3 && added
					 break;
			 }
			 if (i < 3 && j < 3)
				 board[i][j] = 'O'; // marked by the computer
		 } while (true);


	}

}
