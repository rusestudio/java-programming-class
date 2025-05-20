package genericcollection;

import java.util.ArrayList;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new ArrayList of strings.
        ArrayList<String> list = new ArrayList<String>();

        // Add strings to the ArrayList.
        list.add("Python");
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        list.add("Perl");

        // Create a new string array with the same size as the ArrayList.
        String[] my_array = new String[list.size()];

        // Convert the ArrayList to an array and store it in my_array.
        list.toArray(my_array);

        // Iterate through the elements of the string array and print each element.
        for (String string : my_array) {
            System.out.println(string);
        }

	}

}
