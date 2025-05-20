package 실습05;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("배열 크기 입력:");
		size = input.nextInt();
		
		int[] number = new int[size]; 
		
		System.out.print("배열 숫자 입력:");
		
		for (int i = 0; i< size; i++) {
			number[i] = input.nextInt();
		}
		
		int check =0;
		int count = 0;
		
		System.out.print("확인 숫자 압력:");
		check = input.nextInt();
		
		for(int i=0; i<size; i++) {
			if(check == number[i]) {
				count++;
			}
		}
		
		System.out.println(check + "의 갯수는:" + count);
		
		
		
	}

}
