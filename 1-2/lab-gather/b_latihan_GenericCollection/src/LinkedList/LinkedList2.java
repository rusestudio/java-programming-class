package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> numlist = new LinkedList<Integer>();
		numlist.add(2);
		numlist.add(4);
		numlist.add(6);
		numlist.add(8);
		System.out.println(numlist);
		
		//1.swap two element in linked list
		Collections.swap(numlist, 0,2);
		System.out.println(numlist);
		
		//2.shuffle element in list
		Collections.shuffle(numlist);
		System.out.println(numlist);
		
		//3.join 2 linkedlist
		LinkedList<Integer> numlist2 = new LinkedList<Integer>();
		numlist2.add(5);
		numlist2.add(7);
		numlist2.add(9);
		numlist2.add(3);
		
		LinkedList<Integer> joinlist = new LinkedList<Integer>();
		joinlist.addAll(numlist);
		joinlist.addAll(numlist2);
		System.out.println(joinlist);
		
		//4.copy linklist to another
		LinkedList<Integer> newlist = new LinkedList<Integer>();
		newlist =(LinkedList)joinlist.clone();
		System.out.println(newlist);
		
		//5.remove first element and return the rest
		newlist.pop();
		System.out.println(newlist);
		
		//6.retrieve but not remove the first element
		int retriveval = newlist.peekFirst();
		System.out.println(retriveval);
		
		//7.retrieve but not remove the last element
		int retrivelast = newlist.peekLast();
		System.out.println(retrivelast);
		
		//8.check if specific element exist or not
		if(newlist.contains(5)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		//9.convert linked list to arraylist
		ArrayList<Integer> newarraylist = new ArrayList<Integer>(newlist);
			
		for(int i=0; i<newarraylist.size(); i++) {
			System.out.print(newarraylist.get(i)+",");
		}
		System.out.println();
		
		//10.compare 2 linked list
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(0);
		l1.add(3);
		l1.add(6);
		l1.add(8);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(6);
		l2.add(7);
		
		LinkedList<String> comparelist = new LinkedList<String>();
		for( int listnum : l1) {
			comparelist.add(l2.contains(listnum)? "yes" : "no");
		}
		System.out.println(comparelist);
	
	
		//11.check list empty or not
		l1.removeAll(l1);
		System.out.println("is empty?:" + l1.isEmpty());
		
		//12.replace an element in list
		l2.set(1, 56);
		System.out.println(l2);

}}
