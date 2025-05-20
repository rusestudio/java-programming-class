package hello;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        double f;
        
        f = 5 / 4;
        System.out.println(f); // answer in decimal
        
        f = (double) 5 / 4;
        System.out.println(f); // answer in decimal
        
        i = (int) 1.3 + (int) 1.8;
        System.out.println(i); // answer is int
        
	}

}
