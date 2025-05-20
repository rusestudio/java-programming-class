package labansw;
import java.util.Scanner;

public class ArraySwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int [] number = new int[5];
		
		for(int i =0; i<5; i++) {
			number[i] = i+1;
		}
		
		int volume = 0;
		
		System.out.print("횟수를 입력:");
		volume = input.nextInt();
		
		int left =0;
		int right =0;
		int temp =0;
		
		for(int i=0; i<volume; i++) {
			left = input.nextInt() -1 ;
			right = input.nextInt() -1 ;
			
			temp = number[left];
			number[left] = number[right];
			number[right] = temp;

		}
		
		System.out.println("숫자가 바꿘 결과 출력 한다.");
		for(int i=0; i <5; i++) {
			System.out.print(number[i]+ " ");
		}
		

	}

}
