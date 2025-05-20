package baejoon;
import java.util.Scanner;

public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int sub[];
		int n;
		
		//System.out.print("enter number of subject:");
		n= input.nextInt();
		
		sub= new int[n];
		
		for(int i=0; i<n; i++) {
			int mark=input.nextInt();
			sub[i]=mark;
		}
		
		//find max
		int max=sub[0];
		for(int i=0; i<n;i++) {
			if(sub[i]>max) {
				max=sub[i];
			}
		}
		//System.out.println("max sc:"+ max); //80
		
		// Adjust scores and calculate the sum
        double sum = 0;
        for (int newsc : sub) {
            // Ensure floating-point division happens correctly
            double adjustsc = ((double) newsc / max) * 100;
           // System.out.println("Adjusted score: " + adjustsc);
            sum += adjustsc;  // Add the adjusted score to the sum
        }
        
        // Calculate average
        double avg = sum / n;
        System.out.println(avg);

	}

}
