package _7장;

public class Shape2 {
	
	private int x;
	private int y;
	
	public Shape2(int x, int y) {
		System.out.println("Shape()");
		this.x=x;
		this.y=y;
	}

}

class Rectangle2 extends Shape2 {
	
	private int width;
	private int height;
	
	public Rectangle2(int x, int y, int width, int height) {
		super(x,y);
		System.out.println("Rectangle()");
		this.width=width;
		this.height=height;
	}

	
}

