package inheritance;

class Person2 {
	
	private int id;
	protected String name;
	public String job;
	
	public Person2(int id, String name, String job) {
		this.setId(id);  // Corrected: Added missing semicolon here
        this.name = name;
        this.job = job;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

class Doctor extends Person2{
	
	public Doctor(int id, String name, String job) {
		super(id, name, job);
	}
}

public class PersonTest {

	public static void main(String[] args) {
		// Create an object of Doctor class
		Doctor d = new Doctor(1, "Joe", "Nurse");
		
		// Access protected and public fields directly from the Doctor class
		System.out.println(d.name);  // Can access because 'name' is protected
		System.out.println(d.job);   // Can access because 'job' is public
		System.out.println(d.getId());  // Can access 'id' using the public getter method
	}

}
