package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.create n add specific element to hash set
		HashSet<String> hset =  new HashSet<String>();
		hset.add("house");
		hset.add("hospital");
		hset.add("school");
		hset.add("room");
		System.out.println(hset);
		
		//2.iterate through all element in hashset
		Iterator<String> ithashset = hset.iterator();
		while(ithashset.hasNext()) {
			System.out.println(ithashset.next());
		}
		
		//3. get number of element in  hashset
		System.out.println(hset.size());
		
		//4.empty hash set
		hset.removeAll(hset);
		System.out.println(hset);
		
		//5. check hash set empty or not
		System.out.println("hash set empty or not?:"+ hset.isEmpty());
		
		//6.clone hash set to another
		HashSet<String> h1 = new HashSet<String>();
		h1.add("you");
		h1.add("me");
		h1.add("i");
		h1.add("we");
		System.out.println(h1);
		
		HashSet<String> h2 = new HashSet<String>();
		h2 = (HashSet)h1.clone();
		System.out.println(h2);
		
		//7.convert hash set to array
		String[] arrayh = new String[h1.size()];
		h1.toArray(arrayh);
		
		for(int i =0; i<arrayh.length; i++) {
			System.out.println(arrayh[i]);
		}
		
		//8.convert hash set to tree set
		Set<String>treeset = new TreeSet<String>(h1);
		for(String h : treeset) {
			System.out.println(h);
		}
		
		//9.convert hash set t list/array list
		List<String> arraylisth = new ArrayList<String>(h1);
		System.out.println(arraylisth);
		
		//10.compare 2 hash set
		HashSet<String> comparedset = new HashSet<String>();
		for(String h : h1) {
			System.out.println(h2.contains(h)? "yes": "no");
		}
		
		//11.compare 2 set and return element that same
		HashSet<String> h3 = new HashSet<String>();
		h3.add("you");
		h3.add("love");
		h3.add("i");
		h3.add("myself");
		System.out.println(h1);
		System.out.println(h3);
		
		h1.retainAll(h3);
		System.out.println(h1);
		
		//12. remove all element from hash set
		h3.clear();
		System.out.println(h3);
		
		
		
		
	}

}
