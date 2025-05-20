package _17장;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CaeserCipher {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		String plaintext = br.readLine();
		
		System.out.println(CaeserCipher.encode(plaintext,3));
		System.out.println(CaeserCipher.decode(CaeserCipher.encode(plaintext,3),3));
		
		fr.close();
	}
	private static String decode(String enc, int offset) {
		// TODO Auto-generated method stub
		return encode(enc, 26- offset);
	}

	private static String encode(String enc, int offset) {
		// TODO Auto-generated method stub
		offset = offset % 26 + 26;
		
        StringBuilder encoded = new StringBuilder();
        
        for( char i : enc.toCharArray()) {
        	if(	Character.isLetter(i)) {
                if(Character.isUpperCase(i))
                  encoded.append((char)('A'+ (i-'A'+ offset)% 26));
                else 
                	encoded.append((char)('a'+ (i-'a'+ offset)% 26));       ;
        }else {
        	encoded.append(i);
        }
	}
		return encoded.toString();

}}
