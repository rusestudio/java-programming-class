package functionprac;

public class CelciusToFarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("C = -40.0 -->");
		System.out.print("F = ");
		double f = -40.0*9.0 / 5.0 +32.0;
		System.out.println(f);
		
		System.out.print("C = 30.0 -->");
		System.out.print("F = ");
	     f = 30.0*9.0 / 5.0 +32.0;
		System.out.println(f);
		
		System.out.print("C = 40.0 -->");
		System.out.print("F = ");
		f = 40.0*9.0 / 5.0 +32.0;
		System.out.println(f);
		
		//printConvertAndPrint();
	}

	
    public static int ConvertAndPrint(double c)
    {
    	for ( c = -40; c <= 100; c += 5) {
    	double f = c*9.0 / 5.0 + 32.0; //convert
	    //System.out.printf("%.1f도 섭씨는 %.1f도 화씨입니다.\n", c, f);
	    System.out.print("C=" + c + "-->" +f);
	    
	     }
    	
    	return 0;
    }
    }





