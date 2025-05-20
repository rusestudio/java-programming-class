package chp7two;

public class shapebinding2 {
	private static shapebinding arrayOfShapes[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		init();
		drawAll();
		}
		public static void init() {
		arrayOfShapes = new shapebinding[4];
		arrayOfShapes[0] = new Rectangle3();
		arrayOfShapes[1] = new Triangle3();
		arrayOfShapes[2] = new Circle3();
		arrayOfShapes[3] = new Cylinder();
		}
		public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
		arrayOfShapes[i].draw();
		}

	}

}
