package chp6;

public class Rectangle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	//basic contructor
	
	public Rectangle() {
		this(0,0,1,1);
	}
	
	
	//overloading contructor
	public Rectangle(int width, int height) {
		this(0,0,width,height);
		
	}
	
	//overloading contructor
	public Rectangle(int x, int y, int width, int height) {
		this.x= x;
		this.y= y;
		this.width= width;
		this.height= height;
	}
	
	public String toString() {     //overriding convert to string
		return "Rectangle[ x=" + x +
				"y = " + y +
				"height = " + height +
				"width = " + width +"]";
	}
	
	

}
