package chp7two;

public abstract class Shape {
	
	private int x,y;
	
	public void move(int x,int y) {
		this.x= x;
		this.y = y;
	}
	
	public abstract void draw(); //create abstract method

}

class Rectangle extends Shape{
	
	private int width,height;
	
	public void draw() {
		System.out.println("draw triangle method");
	}
}

class Circle extends Shape{
	private int radius;
	
	public void draw() {
		System.out.println("draw circle method");
	}

	
}
	