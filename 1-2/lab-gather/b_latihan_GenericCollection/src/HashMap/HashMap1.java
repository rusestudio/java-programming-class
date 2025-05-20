package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.create and put value
		HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
		hashmap1.put(1, "won");
		hashmap1.put(2,  "myr");
		hashmap1.put(3,  "baht");
		hashmap1.put(4,  "yen");
		hashmap1.put(5,  "euro");
		for(Map.Entry x:hashmap1.entrySet()) {
			System.out.println(x.getKey()+ " " + x.getValue());
		}
		
		//2.count number of key-value size
		System.out.println(hashmap1.size());
		
		//3. copy all mappings to another map
		HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();
		hashmap2.putAll(hashmap1);
		System.out.println(hashmap2);
		
		//4.remove all mappings
		hashmap2.clear();
		System.out.println(hashmap2);
		
		//5.check map empty or not
		boolean checkempty = hashmap1.isEmpty();
		System.out.println("hashmap1 empty?:" + checkempty);
		boolean checkempty2 = hashmap2.isEmpty();
		System.out.println("hashmap2 empty?:" + checkempty2);
		
		//6.clone map 
		HashMap<Integer, String> clonedmap = new HashMap<Integer, String>();
		clonedmap = (HashMap)hashmap1.clone();
		System.out.println(clonedmap);
		
		//7.check map have mapping for specific key
		if(hashmap1.containsKey(2)) {
			System.out.println("yes! value: " + hashmap1.get(2));
		} else {
			System.out.println("no ");
		}
		
		//8.check map have mapping for specific value
		if(hashmap1.containsValue("usd")) {
			System.out.println("yes");
		} else {
			System.out.println("no ");
		}
		
		//9.create set view of mapping
		Set setview = hashmap1.entrySet();
		System.out.println(setview);
		
		//10.get value by specific key
		String value = (String)hashmap1.get(4);
		System.out.println("value: " + value);
		
		//11. get set view of key in map
		Set keyset = hashmap1.keySet();
		System.out.println("key set: " + keyset);
        
        //12. get set view of value in map
        System.out.println("value set: " + hashmap1.values());
		
		
		
		
		
		
		
		
	}

}
