package _7장;

public class Colorrec extends Rectangle2 {
	String color;
	 
	 public Colorrec(int x, int y, int width, int height, String color) {
		 super(x,y,width,height);
		 System.out.println("color rectangle");
		 this.color= color;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colorrec obj = new Colorrec(10,10,20,20,"red");
	}

}
