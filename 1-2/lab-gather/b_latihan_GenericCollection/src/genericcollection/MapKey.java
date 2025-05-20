package genericcollection;

import java.util.HashMap;
import java.util.Map;


public class MapKey {
	
	public static < K, V > void printMap(Map < K, V > map) {
		for (Map.Entry < K, V> entry : map.entrySet()) {
			K key = entry.getKey();
			V value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map < String, Integer> colorMap = new HashMap();
		colorMap.put("Red", 1);
		colorMap.put("Blue", 2);
		colorMap.put("Green", 3);
		
		System.out.println("Color Map:");
		printMap(colorMap);
		
		Map < String, String > capitalMap = new HashMap();
		capitalMap.put("Korea", "Seoul");
		capitalMap.put("USA", "Washington D.C.");
		capitalMap.put("China", "Beijing");
		
        System.out.println("\nCapital Map:");
        printMap(capitalMap);

	}

}
