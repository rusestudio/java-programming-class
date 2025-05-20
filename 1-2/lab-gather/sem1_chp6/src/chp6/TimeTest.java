package chp6;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		Time time2 = new Time(13,27,6);
		Time time3 = new Time(99,66,77);
		
		System.out.println("base initialise time: " + time1);
		System.out.println("overload const time: "+ time2);
		System.out.println("wrong overload time: " + time3);
	}

}
