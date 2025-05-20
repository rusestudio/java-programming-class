package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
	  private String name, SClass;
	  private int age;
	  public Student(String name, int age, String SClass) {
	    this.name = name;
	    this.age = age;
	    this.SClass = SClass;
	  }
	  public String getName() {
	    return name;
	  }
	  public int getAge() {
	    return age;
	  }
	  public String getSClass() {
	    return SClass;
	  }
	}

public class sortlistobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a list of objects
	    List < Student > student_list = new ArrayList < > ();
	    student_list.add(new Student("Adriana Jamie", 15, "X"));
	    student_list.add(new Student("Felix Uisdean", 15, "X"));
	    student_list.add(new Student("Conceicao Palmira", 14, "X"));
	    student_list.add(new Student("Jair Camila", 14, "X"));
	    student_list.add(new Student("Micaela Rosana", 15, "X"));

	    // Student details
	    System.out.println("Student details:");
	    for (Student Student: student_list) {
	      System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
	    }

	    // Sort the list based on age using lambda expression
	    student_list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));


	    // Print the sorted list
	    System.out.println("\nSorted list based on Student Name:");
	    for (Student Student: student_list) {
	      System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
	    }

	}

}
