package egc;

import java.util.ArrayList;
import java.util.Collections;

public class cvscs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection interface (ArrayList is a Collection)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        // Collections utility class
        Collections.sort(list); // Sorts the ArrayList

        System.out.println("Sorted List: " + list);
	}

}
