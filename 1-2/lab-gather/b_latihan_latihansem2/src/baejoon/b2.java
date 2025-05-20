package baejoon;
import java.util.Scanner;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a[];
		int n;
		//enter array n size;
		System.out.print("enter n size:");
		n=input.nextInt(); 
		
		a= new int[n]; // a array size=n
		
		//enter x num to be compare with the array
		System.out.print("enter x number to compare:");
		int x=input.nextInt();
		
		//enter data to put in a array
		for(int i=0; i< n; i++) {
			int data=input.nextInt();
			a[i]= data; //put data in array a
		}
		
		//compare
		for(int compare: a) {
			if(compare <x) {
				System.out.print(compare+ " ");
			}
		}
		
		

	
}
}
