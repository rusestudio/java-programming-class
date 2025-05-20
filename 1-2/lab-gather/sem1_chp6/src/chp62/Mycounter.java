package chp62;

public class Mycounter {
	int value=0;
	
	void inc(int a) {
		a = a +1;
	}
	
	//example test2
	
	void inc (Mycounter ctr) {
		ctr.value = ctr.value + 1; //value 0+1=1
	}

}
