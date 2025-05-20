package chp62;

public class Car {
	
	private String model;
	private String color;
	private int speed;
	
	//car plate num
	private int id;
	static int numbers =0; //static variable or class variable, package access control
	//모든 객체가 공유하는 변수
	//한 번 초기화되면 해당 클래스의 모든 instance에서 동일한 값
	
	
	public Car(String m, String c, int s) {
		model = m;
		color =c;
		speed =s;
		
	//when car number++ assign to id
		id = ++numbers;
	}

}
