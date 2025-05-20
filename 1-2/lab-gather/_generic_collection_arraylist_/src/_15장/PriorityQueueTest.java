package _15장;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

		
		pq.add(30);
	    pq.add(80);
	    pq.add(20);
	    
	    for(Integer o : pq) //priority queue print descending default use heap
	    	System.out.println(o); 
	    System.out.println("원소 삭제");
	    while(!pq.isEmpty())
	    	System.out.println(pq.remove()); //remove() remove from small first
	    System.out.println(); 
	    
	    pq2.add(30);
	    pq2.add(80);
	    pq2.add(20);
	    
	    
	    for(Integer a : pq2) //priority queue print ascending use reverse
	    	System.out.println(a); 
	}

}
