package chp6;

public class Time {
	
	private int hour;
	private int min;
	private int sec;
	
	//first initialise
	public Time() {
		this(0,0,0);
	}

	//overload with cond
	public Time(int h, int m, int s) {
		hour = ((h>=0 && h<24)? h:0);
		min=((m>=0 && m<60)? m:0);
		sec=((s>=0 && s<60)? s:0);
	}
	
	//override to string
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,min,sec);
	}
	
}
