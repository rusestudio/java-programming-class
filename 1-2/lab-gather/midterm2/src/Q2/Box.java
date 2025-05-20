package Q2;

public abstract class Box implements Comparable {
	
	int length=0;
	int width=0;
	int depth=0;
	
	//constructor
	public Box(int length, int width,int depth) {
		this.length=length;
		this.width= width;
		this.depth= depth;
	}
	
	//getter
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	//setter
	public void setLength(int length) {
		this.length= length;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public void setDepth(int depth) {
		this.depth= depth;
	}
	
	//methods
	int surfaceArea(){
		return length*width;
	}
	
	int volume() {
		return length*width*depth;
	}
	
	// comparable interface
	public abstract int compareTo(Object other);
	
	
		
	

}
