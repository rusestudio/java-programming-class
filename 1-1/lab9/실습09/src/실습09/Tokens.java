package 실습09;
import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
         String fruit= "";
		
		System.out.print("입력하세요: ");
		fruit = input.nextLine();
		
		String [] fruitarr = fruit.split("/");
		
		for(int i=0; i < fruitarr.length; i++ ) {
			System.out.println("[" + i+ "]" + fruitarr[i]);
		}

	}

}
