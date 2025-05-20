package exception;

import java.io.IOException;

public class MyIOException {
	
	public static String readString() throws IOException {{
		
		byte[] word = new byte[100];
		
		System.out.println("Enter a word:");
		System.in.read(word);
		
		return new String(word);
		
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(readString());
		}catch (IOException e) {
			e.printStackTrace(); // Prints detailed error information
			System.out.println(e.getMessage()); // Prints detailed error information
			System.out.println(e.toString()); // Prints detailed error information


		}

	}

}
