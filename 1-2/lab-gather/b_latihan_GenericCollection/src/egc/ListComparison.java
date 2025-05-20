package egc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListComparison {
	 public static void main(String[] args) {
	        int size = 100000;
	        Random random = new Random();

	        // Adding elements to ArrayList
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        long startTime = System.nanoTime();
	        for (int i = 0; i < size; i++) {
	            arrayList.add(random.nextInt(100));
	        }
	        long endTime = System.nanoTime();
	        long arrayListTime = endTime - startTime;

	        // Adding elements to LinkedList
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < size; i++) {
	            linkedList.add(random.nextInt(100));
	        }
	        endTime = System.nanoTime();
	        long linkedListTime = endTime - startTime;

	        // Printing the time taken
	        System.out.println("Time taken by ArrayList: " + arrayListTime + " ns");
	        System.out.println("Time taken by LinkedList: " + linkedListTime + " ns");
	    }
}
