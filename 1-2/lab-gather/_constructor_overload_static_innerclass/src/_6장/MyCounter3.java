package _6장;

public class MyCounter3 {
	
	int value =0;
	void inc(int a) {
		a = a + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCounter3 obj = new MyCounter3();
		
		int x =10;
		obj.inc(x);
		System.out.println("x="+x);

	}

} 
