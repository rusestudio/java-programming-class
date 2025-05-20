package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.sort keys in tree map use comparator
		TreeMap<String,String> treemapp = new TreeMap<String,String>( new sort_key());
		treemapp.put("tiger", "lion");
		treemapp.put("winter", "bear");
		treemapp.put("chicken", "fish");	
        System.out.println(treemapp);
	}

}

class sort_key implements Comparator<String>{
	
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
