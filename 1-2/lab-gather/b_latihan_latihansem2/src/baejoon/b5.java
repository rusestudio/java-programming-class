package baejoon;
import java.util.Scanner;

public class b5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int basket[];
		int M;
		
		//System.out.print("enter now many basket:");
		int n=input.nextInt();
		
		basket = new int[n];
		
		//System.out.print("enter now many time move:");
		M=input.nextInt();
		
		for(int m=0; m<M; m++) {
			int i = input.nextInt();//index start
			int j = input.nextInt();//index end
			int k = input.nextInt();// put in index here
			
			for(int x=i-1; x<j; x++) { 
				basket[x]=k; //put k in basket
			}
			
		}
		
		for(int x=0; x<n; x++) {
			System.out.print(basket[x]+ " ");//print basket
		}
		
		
		
		
		
		

	}

}
