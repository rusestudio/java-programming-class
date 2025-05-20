package justprac;
import java.util.ArrayList;
import java.util.Collections;

//add()	Add an item to the list	boolean|void
//addAll()	Add a collection of items to the list	boolean
//clear()	Remove all items from the list	void
//clone()	Create a copy of the ArrayList	Object
//contains()	Checks whether an item exist in the list	boolean
//ensureCapacity()	Increase the capacity of the list to be able to fit a specified number of items	void
//forEach()	Perform an action on every item in the list	void
//get()	Return the item at a specific position in the list	T
//indexOf()	Return the position of the first occurrence of an item in the list	int
//isEmpty()	Checks whether the list is empty	boolean
//iterator()	Return an Iterator object for the ArrayList	Iterator
//lastIndexOf()	Return the position of the last occurrence of an item in the list	int
//listIterator()	Return a ListIterator object for the ArrayList	ListIterator
//remove()	Remove an item from the list	boolean|T
//removeAll()	Remove a collection of items from the list	boolean
//removeIf()	Remove all items from the list which meet a specified condition	boolean
//replaceAll()	Replace each item in the list with the result of an operation on that item	void
//retainAll()	Remove all elements from the list which do not belong to a specified collection	boolean
//set()	Replace an item at a specified position in the list	T
//size()	Return the number of items in the list	int
//sort()	Sort the list	void
//spliterator()	Return a Spliterator object for the ArrayList	Spliterator
//subList()	Return a sublist which provides access to a range of this list's items	List
//toArray()	Return an array containing the list's items	Object[]
//trimToSize()	Reduce the capacity of the list to match the number of items if necessary	Object[]

public class sortarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(33);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(34);
		    myNumbers.add(8);
		    myNumbers.add(12);

		    Collections.sort(myNumbers);

		    for (int i : myNumbers) {
		      System.out.println(i);
		    }
	}

}
