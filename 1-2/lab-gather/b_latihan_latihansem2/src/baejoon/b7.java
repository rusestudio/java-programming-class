package baejoon;
import java.util.Scanner;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int basket[];
		int M;
		
		//System.out.print("enter now many basket:");
		int n=input.nextInt(); //5
		
		//System.out.print("enter now many time move:");
		M=input.nextInt(); //4
		
		basket = new int[n]; //initialize array
		for(int i =0; i< n; i++) {
			basket[i] =i +1;
		}
		
		for(int swap=0; swap<M; swap++) {
			int i = input.nextInt();
			int j = input.nextInt();
			
			i-=1; //to start with 1 index
			j-=1;
			
			int temp = basket[i];// swap ball in basket i and j
			basket[i]= basket[j];
			basket[j] = temp;
		}
		
		for(int k=0; k<n; k++) {
			System.out.print(basket[k]+ " ");//output final basket
		}
		

	}

}
