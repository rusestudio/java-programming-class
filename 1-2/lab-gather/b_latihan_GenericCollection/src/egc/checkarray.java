package egc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class checkarray {
	
	
	public static <T> T checkarray(List<T> list) {
        // Return the first duplicate element, if any
        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            if (list.indexOf(current) != list.lastIndexOf(current)) {
                return current; // Found a duplicate
            }
        }
        return null; // No duplicates
    }

    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<Integer> i1 = new ArrayList<>();

        // Add random elements to the ArrayList
        Random random = new Random();
        for (int i = 0; i < 10; i++) { // Populate with 10 random elements
            s1.add("" + random.nextInt(10)); // Random integers as Strings
        }

        // Call the method and print results
        String duplicate = checkarray(s1);
        System.out.println("ArrayList: " + s1);
        if (duplicate != null) {
            System.out.println("First duplicate found: " + duplicate);
        } else {
            System.out.println("No duplicates found.");
        }	
	}

}
