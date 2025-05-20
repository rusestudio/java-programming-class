package _14장;

class MyException extends Exception {
	public MyException() {
        super("user defined exception "	);
    }
}

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (MyException e) {
			System.err.println(e.getMessage()+ "\nstack content:");
			e.printStackTrace();
		}
	}

	
	public static void method1() throws MyException {
		throw new MyException();
	}
}
