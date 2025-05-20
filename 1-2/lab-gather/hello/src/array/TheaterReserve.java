package array;
import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int size = 10; // seat number = guess number
		int[] seats = new int[size];
		
		while (true) {
			System.out.println("------------------------");
			for (int i =0; i <size; i++) // print seat number
				System.out.print(i+1 + " ");
			System.out.println("\n------------------------");
			for (int i =0; i <size; i++)
				System.out.print(seats[i] + " "); // print i value
			System.out.println("\n------------------------");
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1):");
			Scanner input = new Scanner(System.in);
			
			int s = input.nextInt();
            while (true) {
                if (s == -1) // -1 to end
                    break;
                else if (s <= 0 || s > 10) // Check if s is not within 1 to 10
                    System.out.println("1부터 10 사이의 값을 입력하세요.");
                break;
            }
				
			if (s == -1)  // -1 to end
				break;
			if (seats[s-1] == 0) { //index not = 0,
				seats[s-1] =1;     // to available get index value, save reserve seat
				System.out.println("예약되었습니다.");
				
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
		
			}
		
		}

	}

}
