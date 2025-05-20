package egc;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create array list
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		//add 5 int
		lista.add(29);
		lista.add(7);
		lista.add(0);
		lista.add(3);
		lista.add(1);
		
		//remove one element
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i) == 0)
                lista.remove(i);
		
		//or remove use iterator
		Iterator<Integer> iterator = lista.iterator();
		while (iterator.hasNext()) {
		    if (iterator.next() == 0) {
		        iterator.remove();
		    }
		}

		
		
		
		//display the rest 
		System.out.println(lista);
		
		//find size of array
		System.out.println(lista.size());
	}

}
