package egc;

import java.util.HashSet;
import java.util.Random;

public class hashsetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
            int num = random.nextInt(10);
            set1.add(num);
            int num2 = random.nextInt(10);
            set2.add(num2);
        }		
		
        System.out.println("HashSet1: " + set1);
        System.out.println("HashSet2: " + set2);
        
     // Remove elements from set1 that are also in set2
        set1.removeAll(set2);

        System.out.println("HashSet1 after removing elements present in HashSet2: " + set1);
    
	}

}
