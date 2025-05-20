package chp7;

public class Parallelogram extends Shape2 {

	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth() {
		this.width= width;
	}
	
	public int getHeight(){
		return height;
	}
	public void setHeight() {
		this.height= height;
	}
	
	
	public Parallelogram(int x, int y, int width, int height) {
	   super(x,y);
	   System.out.println("Parallelogram()");
	   this.width = width;
	   this.height = height;
	}
	
	public double calcArea() {
	return (double)width * height;
	
	}

    public static void main(String[] args) {
    	
    Parallelogram obj = new Parallelogram(10,10,50,30);
    obj.calcArea();

}}



