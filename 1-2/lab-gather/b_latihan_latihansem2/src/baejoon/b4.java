package baejoon;
import java.util.Scanner;

public class b4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		for(int i =0; i< 9; i++) {
			int data = input.nextInt();
			arr[i]= data;
		}
		
		int max= arr[0];
		int loc=arr[0];
		
		for(int i =1; i<9;i++) {
			if(arr[i]> max) {
				max= arr[i];
				loc= arr.length-1;
				
			}
		} System.out.println(max);
		System.out.println(loc);
		
		

	}

}
