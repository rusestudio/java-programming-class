package 실습05;
import java.util.Scanner;

public class MinMaxFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int sizearray = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("배열 크기 입력:");
		sizearray = input.nextInt();
		
		int[] number = new int[sizearray];  
		
		System.out.print("배열에 숫자 입력:"); 
		
		for (int i = 0; i < sizearray ; i++) { //gett number wanna compare
			number[i] = input.nextInt();
		}
		
		
		int min = 0;
		min = number[0];
		
		for(int i=0; i < number.length; i++) {
			if(number[i] < min) {
				min = number[i];
			} 
		
		}
		
		System.out.println("배열의 숫자중 최솟값은:" + min);
				
		for(int i=0; i < number.length; i++) {
			if(number[i] > min) {
				min = number[i];
			} 
		
		}
		
		System.out.println("배열의 숫자중 최대값은:" + min);
		
	}

}
