package polymorphism;

public class testshape {

	public static void main(String args[]){  
	
		shape s;
	
	s= new rectangle();
	s.draw();
	
	s= new circle();
	s.draw();
	
	
	s= new triangle();
	s.draw();
	
	}
	
	
	
}
