package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.create and add element to pq
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		q1.add("wesley");
		q1.add("osong");
		q1.add("pdnim");
		q1.add("taehee");
		System.out.println(q1);
		
		//2. iterate through all elements
		for(String q : q1) {
			System.out.println(q);
		}
		
		//3. add all elements to another pq
		PriorityQueue<String> q2 = new PriorityQueue<String>();
		q2.add("euichan");
		q2.add("minjun");
		q2.add("dohyun");
		q2.add("kadrick");
		q1.addAll(q2);
		System.out.println(q1);
		
		//4.insert given element into pq
		q1.offer("dooung");
		System.out.println(q1);
		
		//5.remove all element 
		q1.clear();
		System.out.println(q1);
		
		//6.count number of element in pq
		PriorityQueue<Integer> numq = new PriorityQueue<Integer>();
		numq.add(28);
		numq.add(3);
		numq.add(2002);
		numq.add(12);
		numq.add(13);
		System.out.println(numq.size());
		
		//7.compare 2 pq
		PriorityQueue<Integer> numq2 = new PriorityQueue<Integer>();
		numq2.add(28);
		numq2.add(3);
		numq2.add(2002);
		numq2.add(2);
		numq2.add(10);
		
		System.out.println(numq);
		System.out.println(numq2);
		for(int cpq : numq) {
			System.out.println(numq2.contains(cpq)? "yes" : "no"); 
		}
		
		//8.sort pq
		while (!numq.isEmpty()) {
		    System.out.print(numq.poll() + ",");
		}
		System.out.println();
		
		//9.get first element
		System.out.println(numq2.peek());
		
		//10.get and remove the first element
		System.out.println("remove:" + numq2.poll());
		System.out.println(numq2);
		
		//11.convert pq to array 
		List<Integer> pqlist = new ArrayList<Integer>(numq2);
		System.out.println(pqlist);
		
		//12.convert pq to string 
		String s1; 
		s1 = numq2.toString();
		System.out.println(s1);
		
		//13.change pq to maximum pq
		PriorityQueue<Integer> num = new PriorityQueue<Integer>(5, Collections.reverseOrder());
		//or  PriorityQueue<Integer> num = new PriorityQueue<>((a, b) -> b - a); // Max-Heap
		num.add(98);
		num.add(56);
		num.add(3);
		num.add(15);
		num.add(78);
		
		Integer val = null;
		while((val=num.poll()) != null) {
			System.out.print(val + " ");
		}
		
	}

}
