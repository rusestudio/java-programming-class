package chp6;

public class Student {
	
	private int number;
	private String name;
	private int age;
	
	
	public Student() { //basic contructor
		number = 100;
		name = "anna";
		age = 20;
	}
	
	public Student(int number, String name, int age) { //overloading constructor
		this.number = number;
		this.name= name;
		this.age= age;
	}
	
	public String toString() {     //overriding convert to string
		return "Student[ number=" + number +
				"name = " + name +
				"age = " + age +"]";
	}
	
	

}
