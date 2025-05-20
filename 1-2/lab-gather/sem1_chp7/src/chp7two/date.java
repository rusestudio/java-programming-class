package chp7two;

public class date {

	private int year;
	private int month;
	private int date;
	public date(int year, int month, int date) {
	this.year = year;
	this.month = month;
	this.date = date;
	}
	@Override
	public String toString() {
	return "Date [year=" + year + ", month=" + month + ", date=" + date + "]";
	}

}

 class Employee {
private String name;
private date birthDate; // 구성 관계
public Employee(String name, date birthDate) {
this.name = name;
this.birthDate = birthDate;
}
@Override
public String toString() {
return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
}}
