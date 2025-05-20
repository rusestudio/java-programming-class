package baejoon;
import java.util.Scanner;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n[];
		
		//System.out.print("enter array size:");
		int size = input.nextInt();
		
		n= new int[size];
		
		for(int i=0; i<size; i++) {
			int data = input.nextInt();
			n[i]= data;
		}
		
		//check min max
		int max = n[0]; //start first value with array not 0
		int min=n[0];
		
		for(int i=1; i<size;i++) { // Start from i=1 because n[0] is already in max and min
			if(n[i]> max) { //compare data with data in array in n
				max=n[i];  //compare min max in diff if if sseparte
			}
			
			if(n[i]<min){
				min=n[i];
			}
		} System.out.print(min + " "+ max);

	}

}
