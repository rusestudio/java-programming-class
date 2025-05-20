package exception;

public class Numberformatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int num = Integer.parseInt("ABC");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.err.println("number format error");
            e.printStackTrace();
		}

	}

}
