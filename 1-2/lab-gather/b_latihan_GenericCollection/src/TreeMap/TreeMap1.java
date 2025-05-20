package TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. create and put value
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		treemap.put("ali", 202411);
		treemap.put("aman", 202412);
		treemap.put("adam", 202413);
		treemap.put("aina", 202414);
		treemap.put("alis", 202415);
		
		for(Map.Entry<String, Integer> entrydata : treemap.entrySet()) {
			System.out.println(entrydata.getKey() + " : " + entrydata.getValue());
		}
		
		//2.Copy another treemap  value to  treemap
		TreeMap<String, Integer> copytreemap = new TreeMap<String,Integer>();
		copytreemap.put("buyy", 202417);
		copytreemap.put("tae", 202419);
		copytreemap.put("hand", 202415);
		treemap.putAll(copytreemap);
		System.out.println(treemap);
		
		//3.search for key in treemap
		if(treemap.containsKey("ali")) {
			System.out.println("Found key");
		}else {
			System.out.println("Not found key");
		}
		
		//4. search for value in treemap
		if(treemap.containsValue(202419)) {
			System.out.println("Found value");
		}else {
			System.out.println("Not found value");
		}
		
		//5.get all keys from tree map
		Set<String> keys = treemap.keySet();
		for(String key: keys) {
			System.out.println(key);
		}
		
		//6.delete all elements 
		treemap.clear();
        System.out.println(treemap);
		
		//7.get key-value mapping associated with greatest key n least key
        TreeMap<String,String> treemapp = new TreeMap<String,String>( );
		treemapp.put("c5", "lion");
		treemapp.put("c2", "bear");
		treemapp.put("c7", "fish");	
        System.out.println(treemapp);
        
        System.out.println(treemapp.firstEntry());
        System.out.println(treemapp.lastEntry());
        
        //8.get first lowest and last highest key
        System.out.println(treemapp.firstKey());
        System.out.println(treemapp.lastKey());
        
        //9.reverse order view of keys
        System.out.println(treemapp.descendingKeySet());
		
        //10.get key-value for greatest key for less than or equal to given key
        TreeMap < Integer, String > treem = new TreeMap < Integer, String > ();
        treem.put(10, "Red");
        treem.put(20, "Green");
        treem.put(40, "Black");
        treem.put(50, "White");
        treem.put(60, "Pink");

        System.out.println(treem.floorEntry(10));
        System.out.println(treem.floorEntry(65));
		System.out.println(treem.floorEntry(35));
		
		//11.get greatest key that less than or equal to given key
		System.out.println(treem.floorKey(10));
		System.out.println(treem.floorKey(30));
		System.out.println(treem.floorKey(70));
		
		//12.get the all element of map that key less than given key
		System.out.println(treem.headMap(10));
		System.out.println(treem.headMap(30));
		System.out.println(treem.headMap(70));
		
		//13.get all element that key are less than or equal to given key
		System.out.println(treem.headMap(10, true));
		System.out.println(treem.headMap(30, true));
		System.out.println(treem.headMap(70, true));
		
		//14.get the least key greater than given key- return null if no key
		System.out.println(treem.higherEntry(10));
		System.out.println(treem.higherEntry(30));
		System.out.println(treem.higherEntry(70));
		
		//15. get key-value for greatest key strictly less than givenn key- return null if  no key
		System.out.println(treem.lowerEntry(10));
		System.out.println(treem.lowerEntry(30));
		System.out.println(treem.lowerEntry(70));
		
		//16.get greatest key strictly less than given key- return null if no key
		System.out.println(treem.lowerKey(10));
		System.out.println(treem.lowerKey(30));
		System.out.println(treem.lowerKey(70));
		
		//17.get a NavigableSet view of key in map
		System.out.println(treem.navigableKeySet());
		
		//18.remove and get key-value with least&great key in map
		System.out.println(treem.pollFirstEntry());
		System.out.println(treem);
		System.out.println(treem.pollLastEntry());
		System.out.println(treem);
		
		//19.get element of whose key range from given key to another key(inclusive)
		treem.put(10, "red");
		treem.put(30, "yellow");
		treem.put(50, "pink");
		System.out.println(treem);
		
		SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
		sub_tree_map = treem.subMap(20, 40);
		System.out.println(sub_tree_map);
		
		//20.get element whose key range from given key to another key
		sub_tree_map = treem.subMap(20, true, 40,true);
		System.out.println(sub_tree_map);
		
		//21.get element whose key are greater than or equal to given key
		System.out.println(treem.tailMap(20));
		
		//22.get element of whose key are greater than given key
		System.out.println(treem.tailMap(20, false));
		
		//23.get key-value mapping with least key greater than or equal
		//to the given key. return null if no
		System.out.println(treem.ceilingEntry(20));
		System.out.println(treem.ceilingEntry(40));
		System.out.println(treem.ceilingEntry(70));
		
		//24.get the least key greater than or equal to the given key. return null if no
		System.out.println(treem.ceilingKey(20));
		System.out.println(treem.ceilingKey(45));
		System.out.println(treem.ceilingKey(65));
		

	}
		
}
		





