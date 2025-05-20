package _14장;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt("ABC"); // NumberFormatException 발생
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.err.println("number format error");
		}

	}

}
