package _14장;

public class BadIndex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++) 
             array[i] = 0; // IndexOutOfBoundsException 발생
		try {
			int result = array[12]; // ArrayIndexOutOfBoundsException 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("array index is wrong");
		}
		System.out.println("will this be executed?");
	}

}
