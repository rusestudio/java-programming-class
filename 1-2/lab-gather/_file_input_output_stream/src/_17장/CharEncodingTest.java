package _17장;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CharEncodingTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File fileDir = new File("input2.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(fileDir), "UTF-8"));
		
		String str;
		
		while ((str = in.readLine())!= null) {
            System.out.println(str);
        }

	}

}
