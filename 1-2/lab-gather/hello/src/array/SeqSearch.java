package array;
import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s[] = {0,10,20,30,40,50,60,70,80,90,100} ;
		int value, index = -1; //need to use -1 coz the 0 is in the initial declare value
		
		Scanner input = new Scanner(System.in);
		System.out.print("탈색할 값을 입력하시오:");
		value = input.nextInt();
	
		for (int i =  0; i <  s.length; i++) {
			if (s[i] == value)
				index = i; // save index location to i to print index location
			    
		}
		
		if (index < s.length && index >= 0)
			System.out.println("" + value + " 값은 " + index + " 위치에 있습니다.");
		else
			System.out.println("" + value + " 값은 리스트에 없다");
	}

}
