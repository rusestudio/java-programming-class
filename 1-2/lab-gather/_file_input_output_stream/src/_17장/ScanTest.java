package _17장;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner s = null;
		
		try {
			s = new Scanner(new BufferedReader(new FileReader("input.txt")));
			
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} finally {
			if (s!=null) s.close();
		}

	}

}
