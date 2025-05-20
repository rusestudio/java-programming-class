package egc;

import java.util.PriorityQueue;

class Customer implements Comparable<Customer> {
    String name;
    int priority;

    public Customer(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Customer other) {
        // Higher priority number means higher priority
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class CustomerServiceQueue {
	 public static void main(String[] args) {
	        // Create a priority queue
	        PriorityQueue<Customer> queue = new PriorityQueue<>();

	        // Add customers with different priorities
	        queue.add(new Customer("Alice", 3));
	        queue.add(new Customer("Bob", 1));
	        queue.add(new Customer("Charlie", 2));

	        // Process customers based on their priority
	        while (!queue.isEmpty()) {
	            System.out.println("Processing: " + queue.poll());
	        }
	    }
}
