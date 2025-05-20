package _15장;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		
		list.add(1, "APPLE");
		
		list.set(2, "GRAPE");
		
		list.remove(3);
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		int index = list.indexOf("APPLE");
		System.out.println(index);
		
		int index2 = list.lastIndexOf("MILK");
		System.out.println(index2);
		
		System.out.println(list.size()); //length
	}

}
