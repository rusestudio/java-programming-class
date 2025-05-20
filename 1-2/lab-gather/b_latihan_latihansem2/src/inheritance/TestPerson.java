package inheritance;

class Person {
	
	public final void speak() {
		System.out.println("The person is speaking");
	}
}
	
class Student extends Person{
	
	public void speak() { //cannot override coz final method in parent class
		System.out.println("The student is asking a question");
	}
	
}

class Teacher extends Person{
	
	public void speak() {
		System.out.println("The teacher is giving a lecture");
	}
	
}

public class TestPerson{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		Student s = new Student();
		Teacher t = new Teacher();
		
		p.speak();
		t.speak();
		s.speak();
		
		

	}

	}
