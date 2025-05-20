package exception;

public class BadIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[10];
		
		for(int i=0; i< array.length; i++) {
			array[i]= 0;
			
			//int result = array[12]; // array index out of bound exception
			//System.out.println("print me");
		}
		
		//to fix use try/catch
		try {
			int result = array[12];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("array index is out bound");
		}
		System.out.println("will this print?");

	}

}
