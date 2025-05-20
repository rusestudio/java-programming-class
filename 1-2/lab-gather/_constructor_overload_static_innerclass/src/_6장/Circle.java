package _6장;

public class Circle {
	
	private int radius;
	private Point center; //point is object of other class
	
	public Circle(Point p, int r) {
		center =p;
		radius = r;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point(25,78);
		Circle c = new Circle(p,10);
		
		System.out.println(c);
		
	}

}
