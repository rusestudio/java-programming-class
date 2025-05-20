package egc;

import java.util.HashMap;
import java.util.Scanner;

public class hashmapstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		HashMap<Integer, String> studentinfo = new HashMap<Integer, String>();
		
		System.out.println("Enter the number of students:");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("enter student id and name:");
			int id = input.nextInt();
			String name = input.next();
			studentinfo.put(id, name);
		}
		
		System.out.println(studentinfo);

		//iterate through keys and values
		for (Integer key : studentinfo.keySet()) {
            System.out.println("ID: " + key );
        }
        
        for (String value : studentinfo.values()) {
        	System.out.println("Name: " + value);
        }
        
        
		
		
		
	}

}
