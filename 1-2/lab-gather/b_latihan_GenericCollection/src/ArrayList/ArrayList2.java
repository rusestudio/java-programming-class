package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> notes = new ArrayList<String>();
		notes.add("buy");
		notes.add("study");
		notes.add("cook");
		notes.add("exam");
		System.out.println(notes);
		
		ArrayList<Integer> money = new ArrayList<Integer>();
		money.add(10);
		money.add(20);
		money.add(50);
		money.add(100);
		System.out.println(money);
		
		//1.extract sub portion of the list
		List<String> sub_notes = notes.subList(0, 2);
		System.out.println("Sublist:"+sub_notes);
		
		//2.compare 2 array list
		System.out.println("notes: "+notes);
		
		ArrayList<String> notes2 = new ArrayList<String>();
		notes2.add("eat");
		notes2.add("sleep");
		notes2.add("study");
		notes2.add("play");
		System.out.println("notes2: " +notes2);
		
		ArrayList<String> comparenotes = new ArrayList<String>();
		for(String n : notes)
			comparenotes.add(notes2.contains(n) ? "Yes" : "No");
		System.out.println("value in notes contains in notes2?" +comparenotes);
		
		//3.swap element in same array
		Collections.swap(notes2, 0, 3);
		System.out.println(notes2);
		
		//4.join 2 array list
		System.out.println("money:" + money);
		
		ArrayList<Integer> money2 = new ArrayList<Integer>();
		money2.add(5);
		money2.add(15);
		money2.add(25);
		money2.add(150);
		System.out.println("money2: " + money2);
		
		ArrayList<Integer> combine_money = new ArrayList<Integer>();
		combine_money.addAll(money);
		combine_money.addAll(money2);
		System.out.println("combine money: " + combine_money);
		
		//5.clone array list to another array list
		ArrayList <Integer> clonemoney = (ArrayList<Integer>) ((ArrayList<Integer>) money2).clone();
		System.out.println("clone money: " + clonemoney);
		
		//6.empty array list
		clonemoney.removeAll(clonemoney);
		System.out.println("after remove clone money: " + clonemoney);
		
		//7. test whether an array list is empty or not
		System.out.println("money:" + money);
		System.out.println("money is empty? " + money.isEmpty());
		money.removeAll(money);
		System.out.println("money is empty? " + money.isEmpty());
		
		//8. trimming the capacity of arraylist
		System.out.println("money2: " + money2);
		((ArrayList<Integer>) money2).trimToSize();
		System.out.println("money2 after trimToSize: " + money2);
		
		
		//9. increase array list size
		((ArrayList<Integer>) money2).ensureCapacity(6); //increase capacity to 6
		money2.add(100);
		money2.add(14);
		System.out.println("money2 after ensureCapacity: " + money2);
		
		//10. replace second element with specified element in arraylist
		System.out.println("notes: "+notes);
		String new_notes = "call";
		notes.set(1, new_notes);
		System.out.println("notes after replace: "+notes);
		
		//11. print all elements of arraylist use element position
		for(int i =0; i<notes.size(); i++) {
			System.out.println(notes.get(i));
		}
		

	}

}
