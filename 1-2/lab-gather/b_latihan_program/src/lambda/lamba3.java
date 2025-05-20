package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

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

public class lamba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.sort list based on attribute
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
	    student_list.sort(Comparator.comparing(Student::getName));

	    // Print the sorted list
	    System.out.println("\nSorted list based on Student Name:");
	    for (Student Student: student_list) {
	      System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
	    }
	    //2. calc sum all prime
	      int start_prime = 100;
	      int end_prime = 200;

	      // Calculate the sum of prime numbers using lambda expression
	      int sumOfPrimes = IntStream.rangeClosed(start_prime, end_prime)
	        .filter(lamba3::isPrime)
	        .sum();
	      System.out.println("Sum of prime numbers between " + start_prime + " and " + end_prime + ": " + sumOfPrimes);
	    }
	    // Lambda expression to check if a number is prime
	    public static boolean isPrime(int number) {
	      if (number <= 1) {
	        return false;
	      }
	      for (int i = 2; i <= Math.sqrt(number); i++) {
	        if (number % i == 0) {
	          return false;
	        }
	      }
	      return true;
	    }
	      

}
