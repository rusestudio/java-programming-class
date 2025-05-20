import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
		
		int n; 
		
		System.out.print("삼각형의 층 수 입력:");
		n = input.nextInt();
		
		int n1 = n-1;
		
		for(int i=0; i<n; i++) {
			for(int p=0; p<n1; p++) {
				System.out.print(" ");
			}
			for(int q=0; q<n-n1; q++) {
				System.out.print("*");
			}
			System.out.println();
			n1--;


	}

}}