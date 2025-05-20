package chp7two;

public class abstractest1 {

	public static void main(String[] args) {
		//Shape s = new Shape(); // cannot call abstarct method in parent calls
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		r.draw();
		c.draw();
	
}}
