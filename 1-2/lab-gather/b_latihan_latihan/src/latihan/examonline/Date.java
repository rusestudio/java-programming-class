package latihan.examonline;

public class Date {
	
	int year;
	int month;
	int day;
	
	// Constructor for objects of class Date
	 public Date(int m, int y, int d)
	 { month = m;
	 year = y;
	 day = d;
	 }
	 //a method is to print the date in the format; mm/dd/yyyy
	 public void printDate()
	 { System.out.println (month+"/" +day + "/" + year); }

}
