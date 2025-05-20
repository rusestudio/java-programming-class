package week13;

abstract class Shape {
	 private int x;
	 private int y;
	
	 public void move(int x,int y) {
		 this.x=x;
		 this.y=y;
	 }
	 
	 public abstract void draw() ;
	 public abstract double area();
	 
	 public int getX() {
		 return x;
	 }
	 
	 public int getY() {
		 return y;
	 }
}

class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double width,double height) {
		this.width= width;
		this.height= height;
	}
	
	public void draw() {
		System.out.println("("+ getX() + "," + getY() + ") 위치에 가로:" + width + " 세로:" + height);
	}
	
	public double area() {
		return width*height;
	}
	
}
class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	
    public void draw() {
    	System.out.println("("+ getX() + "," + getY() + ") 위치에 밑변:" + base + " 세로:" + height);
	}
	
	public double area() {
		return (base*height)/2.0;
	}

}
class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius= radius;
	}
	
    public void draw() {
    	System.out.println("("+ getX() + "," + getY() + ") 위치에 반지름:" + radius);
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	
}
