package chp7;

public class Rectangle2 extends Shape2{
	
	private int width;
	private int height;
	
	public Rectangle2(int x, int y, int width, int height) {
		super(x,y);
		System.out.println("Rectangle()");
		this.width= width;
		this.height= height;
	}
	
	public double area() {
		return (double) width* height;
	}
}
