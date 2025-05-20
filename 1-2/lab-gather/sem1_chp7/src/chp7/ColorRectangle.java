package chp7;

public class ColorRectangle extends Rectangle2 {
	
	private String color;
	
	public ColorRectangle(int x, int y, int width, int height, String color) {
		super(x,y,width,height);
		System.out.println("colorrectangle()");
		this.color= color;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorRectangle obj = new ColorRectangle(10,10,20,20,"red");

	}

}
