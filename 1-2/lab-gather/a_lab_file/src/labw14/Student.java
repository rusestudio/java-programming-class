package labw14;

public class Student implements Comparable {
	
	private String id;
	private String name;
	private String department;
	private double gpa;
	
	public Student(String id, String name, String department, double gpa) {
		this.id = id;
        this.name = name;
        this.department = department;
        this.gpa = gpa;
	}
	
	public double getGpa() {
        return gpa;
    }
	
	public String toString() {
		return String.format("학번: %s, 이름: %s, 학과: %s, 성적: %.2f", id, name, department, gpa); 
	}

	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		Student student = (Student) other;
		return Double.compare(student.gpa, gpa);
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
        return name;
    }
	
	public String getDepartment() {
        return department;
    }

}
