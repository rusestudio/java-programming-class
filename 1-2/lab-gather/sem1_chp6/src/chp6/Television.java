package chp6;

public class Television {

	private int channel;
	private int volume;
	private boolean onOff;
	
	public Television(int c, int v, boolean o) {
		channel = c;
		volume =v;
		onOff=o;
	}
	
	
	void print(){
		System.out.println("channel= "+ channel+ " ,volume=" + volume);
	}
}
