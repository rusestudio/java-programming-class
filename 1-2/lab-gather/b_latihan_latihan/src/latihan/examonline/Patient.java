package latihan.examonline;

public class Patient {
	
	String name;
	int age;
	String disease;
	Date adminDate;
	Date discharge;
	
	//Constructor for objects of class Hospital
	 public Patient()
	 { // initialise instance variables
	 name = "";
	 age = 0;
	 disease = "";
	 adminDate = new Date (3, 12, 2003);
	 discharge = new Date (4, 2, 2003);
	 }
	
	// methods to set and get patient's information

	 public void setName(String na)
	 { name = na; }
	 public String getName()
	 { return name; }
	 public void setAge(int a)
	 { age = a;}
	 public int getAge()
	 { return age; }
	 public void setDisease( String dis)
	 { disease = dis;}
	 public void setAdimDate( Date d)
	 { adminDate = d; }
	 public Date getAdminDate()
	 { return adminDate;}
	 public void setDischarge( Date d)
	 { discharge= d; }
	 public Date getDischarge()
	 { return discharge;}

	 public void display()
	 { System.out.println("Name = "+name+" age = "+age+
	 " Disease = "+disease);
	 System.out.print(" Admission date= ");
	 adminDate.printDate();
	 System.out.print(" Discharge Date = ");
	 discharge.printDate();
	 }
	

}
