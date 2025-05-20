package interfaceee;

interface Shape{
	
	public int getArea();
}

class Rectangle implements Shape{
	
	int l;
	int h;

	public Rectangle(int i, int j) {
		// TODO Auto-generated constructor stub
		this.l=i;
		this.h=j;
	}

	@Override
	public int getArea() {
		return l*h;
		// TODO Auto-generated method stub
		
	}
	
}

class Circle implements Shape{
	int r;

	public Circle(int i) {
		// TODO Auto-generated constructor stub
		this.r=i;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int) (Math.PI*r*r);
		
		
	}
	
}

class Triangle implements Shape{
	int l;
	int h;

	public Triangle(int i, int j) {
		// TODO Auto-generated constructor stub
		this.l=i;
		this.h=j;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int) (0.5*(l*h));
		
	}
	
}

public class TestShapeinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(10,12);
		Circle c = new Circle(3);
		Triangle t =  new Triangle(4,6);
		
		System.out.println("rectangle: "+r.getArea());
		System.out.println("circle: "+c.getArea());
		System.out.println("triangle: "+t.getArea());

	}

}
