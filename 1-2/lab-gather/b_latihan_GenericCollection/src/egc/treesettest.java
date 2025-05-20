package egc;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class treesettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		Random random = new Random();
		
		for(int i =0; i <10; i++) {
			int num = random.nextInt(10)+1;
			ts.add(num);
		}
		System.out.println(ts);
		
		//ascending, treeset is auto sort up
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		
		//descending
		Iterator ittreeset = ts.descendingIterator();
		while(ittreeset.hasNext()) {
			System.out.print(ittreeset.next()+ " ");
		}
		

	}

}
