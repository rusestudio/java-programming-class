package _6장;

public class Time {
	
	private int hour;
	private int min;
	private int sec;
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int h, int m, int s) {
		hour =((h>=0 && h< 24)? h:0);
		min= ((m>=0 && m< 60)? m:0);
		sec= ((s>=0 && s<60)? s:0);
	}
	
	public String toString() {
		return String.format("%02d: %02d: %02d",hour, min, sec);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time1 = new Time();
		System.out.println("기본 생성자 호출 후 시간:" + time1.toString());
		
		Time time2 = new Time(13, 27,6);
		System.out.println("두 번째 생성자 호출 후 시간:" + time2.toString());
		
		Time time3 = new Time(99,66,77);
		System.out.println("올바르지 않은 시간 설정 후 시간:" + time3.toString());
		
		
		
		

	}

}
