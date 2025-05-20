package _4장;
import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int list[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int value, index = -1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("탐색할 값을 입력하시오: ");
		value = input.nextInt();
		
		for(int i= 0; i< list.length; i++) {
			if (list[i] == value) {
				index = i;
				break;  // 배열에서 탐색한첫번째위치
			}
		}
		if (index < list.length && index >= 0)
			System.out.println("" + value + " 값은 "+ index + " 위치에있습니다.");

	}

}
