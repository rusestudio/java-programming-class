package baejoon;
import java.util.Scanner;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n[];
		int size;
		
		//enter n = size
		size=input.nextInt();
		
		n = new int[size];
		
		//enter number based on space and as much as size
		for(int i=0; i< size; i++) {
			int number = input.nextInt(); 
			n[i]=number;//put number in n[i] index
		}
		
		//in the array want to find v
		int v;
		v=input.nextInt();
		
		
		
		int find=0;
		//check array for value v in array n
		for(int check : n) {
			if (check== v) {
				find += 1;
			}
			
		}
		
		System.out.print(find);
		
		
	

	}

}
