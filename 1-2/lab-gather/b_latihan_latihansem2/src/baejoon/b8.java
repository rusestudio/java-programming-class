package baejoon;
import java.util.Scanner;

public class b8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		boolean[] submitted = new boolean[31];// index 1 to 30 ignore index 0
		
		//read the 28 submitted student numbers
		for(int i=0; i< 28; i++) {
			int number = input.nextInt();
			submitted[number]= true; //mark that this student has submitted
		}
		
		// find the 2 student who did not submit
		int[]  missing = new int[2]; //array to store the 2 two missing number
		int index=0; 
		
		for(int i=1; i<=30; i++) { //loop through student numbers 1 to 30
			if(!submitted[i]) {    // if the student didnt submit
				missing[index] =i;
				index++;
			}
		}
		
		//print the missing number in increasing order
		System.out.println(missing[0]);
		System.out.println(missing[1]);
		
	}

}
