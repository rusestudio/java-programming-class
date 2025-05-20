package _6장;

public class Point {
	private int x;
	private int y;
	
	public Point(int a, int b) { //parameter a b as placeholder when value insert or change
		x=a; //assign parameter to x, y
		y=b;
	}
	
	public String toString() {
		return "Point [x="+ x+ ", y="+ y+ "]";
	}

}
