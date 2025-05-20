package Lambda;
import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class convertuppertolower {

    public static void main(String[] args) {
        // Create a list of strings with proper typing
        List<String> stringList1 = Arrays.asList("Red", "Green", "Blue", "PINK");

        // Print the original strings
        System.out.println("\nOriginal strings:");
        for (String str : stringList1) {
            System.out.println(str);
        }

        // Convert strings to lowercase using lambda expression
        stringList1.replaceAll(str -> str.toLowerCase());

        // Print the list of lowercase strings
        System.out.println("\nLowercase strings:");
        for (String str : stringList1) {
            System.out.println(str);
        }

        // Convert strings to uppercase using lambda expression
        stringList1.replaceAll(str -> str.toUpperCase());

        // Print the list of uppercase strings
        System.out.println("\nUppercase strings:");
        for (String str : stringList1) {
            System.out.println(str);
        } // Closing brace for the `for` loop
    } // Closing brace for the `main` method
}
