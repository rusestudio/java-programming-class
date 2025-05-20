package labw2;

import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("높이를 입력:");
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j =0; j<n-i; j++ )
				System.out.println(" ");
			for(int j = 0; i<i; j++)
				System.out.println(i%10+" ");
			System.out.println();
		}
		input.close();

	}

}
