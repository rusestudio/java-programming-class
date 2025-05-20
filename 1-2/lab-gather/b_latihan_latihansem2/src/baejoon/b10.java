package baejoon;
import java.util.Scanner;

public class b10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int basket[];
		
		int n=input.nextInt();
		int M=input.nextInt();
		
		basket = new int[n];
		for(int i=0;i<n;i++) {
			basket[i]=i+1;
		}
		
		for(int k=0; k<M;k++) {
			int i= input.nextInt();
			int j= input.nextInt();
	
		reverse(basket, i-1,j-1);
		
		}
		
		for(int numbasket: basket) {
			System.out.print(numbasket+ " ");
		}
	}
	
	
	public static void reverse(int[] arr, int i,int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
