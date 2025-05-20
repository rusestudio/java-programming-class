package _14장;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(readString()); // NullPointerException 발생
		}catch(IOException e) {
				System.err.println("IOException caught: " + e.getMessage());
            e.printStackTrace();
		}

	}
	
	public static String readString() throws IOException {
		byte[] buf = new byte[10]; // NullPointerException 발생
		
		System.out.println("enter string:");
		System.in.read(buf);
		return new String(buf);
		
	}

}
