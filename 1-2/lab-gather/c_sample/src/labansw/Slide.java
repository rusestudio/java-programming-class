package labansw;
import java.util.Scanner;

public class Slide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  input =new Scanner(System.in);
		
		char[][] str = new char[5][5];
		
		String temp = "";
		
		for (int i =0; i<str.length; i++) {
			temp =input.next();
			for(int j =0; j< temp.length();j++) {
				str[i][j] = temp.charAt(j);
			}
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(str[j][i] == '\0')
					continue;
				System.out.print(str[j][i]);
			}
		}

	}

}
