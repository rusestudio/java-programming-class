package week13;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(2, 4.8);
		Triangle tri = new Triangle(3.5, 3);
		Circle cir = new Circle(5.5);
		
		rec.move(5,10);
		rec.draw();
		System.out.println("area: " + rec.area());
		
		tri.move(1, 3);
		tri.draw();
		System.out.println("area: " + tri.area());
		
		cir.move(30, 30);
		cir.draw();
		System.out.println("area: " + cir.area());
		
	}

}
