package chp6;

public class Box {
	
	private int width;
	private int length;
	private int height;
	private int volume;
	
	
	public int getVolume() {
		return volume;
	}

	public Box (int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume= width*length*height;
	}
	
	
}
