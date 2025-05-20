package array;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SIZE = 6;
		int freq[] = new int [SIZE];
		
		//can use count as variable get input
		
		for (int i = 0; i <10000; i++) //10000 change to count to accept input value
			++freq[(int) (Math.random() * SIZE)];
		
		System.out.println("================");
		System.out.println("면\t빈도");
	    System.out.println("================");
	    
	    for (int i = 0; i< SIZE; i++)
	    	System.out.println("" + (i + 1) + "\t" + freq[i]);

	}

}
