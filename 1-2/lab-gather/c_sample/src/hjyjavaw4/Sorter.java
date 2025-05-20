package hjyjavaw4;
import java.util.Scanner;

public class Sorter { //Q5

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int i,j,k;
		
		System.out.print("정수 세 개:");
		i = input.nextInt(); 
		j = input.nextInt();
		k = input.nextInt();   //arrange based on lowest to highest
		
		
		if ( i <=j && i<=k) {
			if(j<k) {
				System.out.print(i+"\s");
				System.out.print(j+"\s");
				System.out.print(k+"\s" );
			} else {
				//System.out.println(i + k + j);
				System.out.print(i+"\s");
				System.out.print(k+"\s");
				System.out.print(j+"\s");
			}
				
		} else if ( j<=i && j<=k) {
			if(i<k) {
				//System.out.println(j + i + k);
				System.out.print(j+"\s");
				System.out.print(i+"\s");
				System.out.print(k+"\s" );
			} else {
				//System.out.println(j + k + i);
				System.out.print(j+"\s");
				System.out.print(k+"\s");
				System.out.print(i+"\s" );
			}
		} else {
			if (i<j) {
				//System.out.println(k + i + j);
				System.out.print(k+"\s");
				System.out.print(i+"\s");
				System.out.print(j +"\s");
			} else {
				//System.out.println(k + j + i);
				System.out.print(k+"\s");
				System.out.print(j+"\s");
				System.out.print(i+"\s");
			}
		}
		
	}

}
