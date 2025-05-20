package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.create and add elements  to treeset
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("iphone");
		tset.add("samsung");
		tset.add("oppo");
		tset.add("microsoft");
        System.out.println(tset);
        
        //2.iterate through all elements in treeset
        for(String t : tset) {
        	System.out.println(t);
        }
        
        //3. add all element in tree set to another tree set
        TreeSet<String> tset2 = new TreeSet<String>();
		tset2.add("window");
		tset2.add("mac");
		tset2.add("linux");
		tset2.add("x86");
		System.out.println(tset2);
		
		tset.addAll(tset2);
		System.out.println(tset);
		
		//4.reverse order of element
		Iterator ittreeset = tset.descendingIterator();
		while(ittreeset.hasNext()) {
			System.out.println(ittreeset.next());
		}
		
		//5.get first & last element
		Object firstel = tset.first();
		Object lastel = tset.last();
		System.out.println("first element: "+ firstel);
		System.out.println("last element: "+ lastel);
		
		//6.clone tree set to another
		TreeSet<String> clonedset = (TreeSet<String>)tset.clone();
		System.out.println(clonedset);
		
		//7.get the number of elements in treeset
		System.out.println(tset.size()); 
		
		//8.comapre 2 tree set
		for(String ts : tset) {
			System.out.println(clonedset.contains(ts)? "yes" : "no");
		}
		
		//9.find number less then x =7 in tree set
		TreeSet <Integer> t1 = new TreeSet<Integer>();
		t1.add(1);
		t1.add(9);
		t1.add(7);
		t1.add(3);
		
		TreeSet<Integer> treeheadset = new TreeSet<Integer>();
		treeheadset = (TreeSet)t1.headSet(7);
		
		Iterator it = treeheadset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//10.get element greater or equal than x , >=x
		//must have too: TreeSet<Integer> changevarname = new TreeSet<Integer>();
		System.out.println("number>=7: " + t1.ceiling(7));
		
		//11.get element less or equal than x
		//must have too: TreeSet<Integer> changevarname = new TreeSet<Integer>();
		System.out.println("number<=5: " + t1.floor(5));
		
		//12.get element strictly greater than or equal to x, >=x only
		//must have too: TreeSet<Integer> changevarname = new TreeSet<Integer>();
		System.out.println("number > 7: " + t1.higher(7));
		
		//13. get element strictly less than or equal to x, <=x only
		//must have too: TreeSet<Integer> changevarname = new TreeSet<Integer>();
		System.out.println("number < 3: " + t1.lower(3));
		
		//14.remove first & last element of tree set
		System.out.println("remove:" + t1.pollFirst()); //1
		t1.pollLast(); //9
		System.out.println(t1);
		
		//15. remove given element from tree set
		t1.remove(7);
		System.out.println(t1);
		
		
	}

}
