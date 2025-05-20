package _15장;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class people implements Comparable<people>{
	
	int number;
	String name;
	
	public people(int number, String name) { // constructor with 2 parameters
        this.number = number;
        this.name = name;
    }
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(people s) {
		// TODO Auto-generated method stub
		return number - s.number;  //use  this method to sort
	}
	
}

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		people[] array = {
				new people(5, "John"),
                new people(3, "David"),
                new people(2, "Alice"),
                new people(4, "Bob"),
                new people(1, "Charlie")
                };
		
		List<people> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.print(list);
		

	}

}
