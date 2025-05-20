package chp7two;

public class shapebinding {
	protected int x, y;
	public void draw() {
	System.out.println("Shape Draw");
	}
	}
	class Rectangle3 extends shapebinding {
	private int width, height;
	public void draw() {
	System.out.println("Rectangle Draw");
	}
	}
	class Triangle3 extends shapebinding {
	private int base, height;
	public void draw() {
	System.out.println("Triangle Draw");
	}
	}
	
	class Circle3 extends shapebinding {
		private int radius;
		public void draw() {
		System.out.println("Circle Draw");
		}

}
	class Cylinder extends shapebinding {
		private int radius, height;
		public void draw() {
		System.out.println("Cylinder Draw");
		}}
