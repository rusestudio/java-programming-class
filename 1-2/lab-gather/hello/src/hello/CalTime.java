package hello;

public class CalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final double light_speed = 30e4;
        double distance = 40e12;
        
        double secs;
        
        secs = distance/light_speed;// formula for distance
        
        double light_year = secs/(60.0*60.0*24.0*365.0);
        System.out.println("걸리는 시간은 " + light_year + "광년입니다.");
	}

}
