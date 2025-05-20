package labansw;

public class Equation {
	
	//4x+5y =60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x=1 ; x<=15; x++) {
			for (int y =1; y<=12; y++) {
				if (4*x+5*y ==60) {
					System.out.println("("+ x +","+ y + ")");
				}
			}
		}

	}

}
