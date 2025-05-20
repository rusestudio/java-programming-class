package _6장;

public class MyCounter4 {
	
	int value =0;
	void inc(MyCounter4 ctr) {
		ctr.value= ctr.value +1;	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCounter4 obj1 = new MyCounter4();
		
		System.out.println("obj.value=" + obj1.value);
		obj1.inc(obj1);
		System.out.println("obj.value=" + obj1 .value);

	}

}
