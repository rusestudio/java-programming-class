package egc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class itvslit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Using Iterator (only forward)
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using ListIterator (forward and backward)
        System.out.println("\nUsing ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        
        // Forward traversal
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Backward traversal
        System.out.println("\nBackward traversal listiterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
	}

}
