package chp6;

public class Date {
	
	private int year;
	private String month;
	private int day;
	
	//basic const
	public Date() {
		year= 1900; 
		month = "jan";
		day= 1;
	}
	
	//initialise const
	public Date(int year) {
		this(year,"jan",1);
	}
	
	//overload const current method
	public Date(int year, String month, int day) {
		this.year= year;
		this.month= month;
		this.day= day;
	}
	
	//override to string
	public String toString() {
		return "Date[ year=" + year +
				" month=" + month +
				" day=" + day +" ]";
	}

}
