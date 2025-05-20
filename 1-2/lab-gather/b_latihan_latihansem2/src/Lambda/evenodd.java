package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenodd {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        
        System.out.println("Original numbers:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        
        // Filter even numbers
        List<Integer> evenNumbers = nums.stream()
                .filter(n -> n % 2 == 0)//filter use nums.stream
                .collect(Collectors.toList());
        
        System.out.print("\nEven numbers:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        
        // Filter odd numbers
        List<Integer> oddNumbers = nums.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        
        System.out.print("\nOdd numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }
}

//example use nums.stream() to filter/map/reduce based on condition
//List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

// Filter numbers greater than 50, double them, and sum them
//int result = nums.stream()
        //.filter(n -> n > 50)
        //.map(n -> n * 2)
       // .reduce(0, (a, b) -> a + b); // or use Integer::sum

//System.out.println("Sum of doubled numbers greater than 50: " + result);
