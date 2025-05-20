package chp62;

public class Car2StaticMethod {
	
	private String model;
	private String color;
	private int speed;
	private int id;
	private static int numbers =0; //Static variable for the number of instantiated Car obj
	
	public Car2StaticMethod(String c, String m, int s) {
		    model =m;
			color =c;
			speed =s;
			id = ++numbers; //when number increase put into id
	}
	
	public static int getNumberofCars() { //in staticmethod, instance var and instance method cannot access
		return numbers;
	}
	
	
	
	
	

}
