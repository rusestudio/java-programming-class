package _7장;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width= width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height= height;
	}
	
	public double area() {
		return (double)width*height;
	}
	
	public void draw() {
		System.out.println("("+ this.getX()+ "," + this.getY()+ 
				") coordiate at width:" + width + " height:" + height);
	}

}
