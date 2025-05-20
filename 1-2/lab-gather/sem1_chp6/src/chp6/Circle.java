package chp6;

public class Circle {
	
	private int radius;
	private Point center;
	final double PI =3.14;
	private double area;

	public Circle() { 
		this(new Point(0,0), 1, 1);
	}
	
	public Circle(Point p, int r, double area) {
		center = p;
		radius = r;
		area= area;
	}
	
	public int getRadius() {
		return radius;
		
	}
	
	public void setRadius(int radius) {
		this.radius= radius;
	}
	
	//get and set for center
	
	public void setCenter(Point center) {
		this.center= center;
	}
	
	
    public Point getCenter() {
		return center;
	}
	
	public double area() {
		return PI* radius* radius;
	}
	
	@Override
	public String toString() {
	return "Circle [radius=" + radius + ", center=" + center + ",area ="+ area+"]";
	
	}
	
	

}
