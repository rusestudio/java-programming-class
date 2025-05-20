package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.create linkedList and add element
		LinkedList<String> colorlist = new LinkedList<String>();
		colorlist.add("red");
		colorlist.add("yellow");
		colorlist.add("green");
		System.out.println(colorlist);
		
		//2.iterate through all elements in list
		for(int i=0; i< colorlist.size(); i++) {
			System.out.println(colorlist.get(i));
		}
		
		//3.iterate in reverse order
		Iterator it = colorlist.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4.insert specific element at specific position
		colorlist.add(1,"pink");
		System.out.println(colorlist);
		
		//5.insert element at first n last position
		colorlist.addFirst("black");
		colorlist.addLast("white");
		System.out.println(colorlist);
		
		//6.insert specific element at front of list
		colorlist.offerFirst("Purple");
		System.out.println(colorlist);
		
		//7.insert specific element at end of list
		colorlist.offerLast("blue");
		System.out.println(colorlist);
		
		//8.combine linked list at specified index
		LinkedList<String> color2 = new LinkedList<String>();
		color2.add("babyblue");
		color2.add("cyan");
		colorlist.addAll(1, color2);
		System.out.println(colorlist);
		
		//9.get first& last occurrence of speficied element
		Object first_element = colorlist.getFirst();
		Object last_element = colorlist.getLast();
		
		System.out.println("object 1st element: "+ first_element);
		System.out.println("object last element: "+ last_element);
		
		//10.display elements and their index in linked list
		for(int i =0; i<colorlist.size(); i++) {
			System.out.printf("%d = %s\n", i, colorlist.get(i));
		}
		
		//11.remove element from array
		colorlist.remove("blue");
		colorlist.remove(5);
		System.out.println(colorlist);
		
		//12.remove the first and last element
		Object firstobj = colorlist.removeFirst();
		Object lastobj = colorlist.removeLast();
		System.out.println(colorlist);
		
		//13. remove all elements from list
		colorlist.clear();
		System.out.println(colorlist);
		
		
		
	}

}
