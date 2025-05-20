package array;

public class RandomWalkBee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =5, y = 5;  // decalre initial location 
		boolean tile[][]= new boolean[10][10];
		int steps; 
		
		tile[5][5]= true; // when true the initial location loop random direction
		for (steps = 0; steps < 10; steps++) {
			int direction = (int)(Math.random()*4); // get random value 0.0 >= 3
			if (direction == 0 && x > 0) //move left //>0 so tht the value no -ve number
				x--;                     // x =column index
			else if(direction == 1 && x < 9) // move right // 9 so that it will not pass the board size which is 10
				x++;
			else if(direction == 2 && y > 0) // move up
				y--;                        // y =row index
			else if (direction == 3 && y < 9) // move down
				y++;
		
		tile[y][x] = true; // when x y value moved is true
		System.out.println("-----------------------");
		for(int i = 0; i< 10; i++) { // when row 
			for(int j = 0; j< 10; j++) { //when coloum 
				if (tile[i][j]== true)
					System.out.print("#"); // when the bee moved on tile print #
				else
					System.out.print("."); // when not moved on tile print .
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		}
		System.out.println("전체 이동 수는 = " + steps);

	}

}
