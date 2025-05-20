package functionprac;

public class globalprac {
	
	static int i =0;
	
	static void increment() {
		System.out.print(++i + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++)
			increment();
	}

}
