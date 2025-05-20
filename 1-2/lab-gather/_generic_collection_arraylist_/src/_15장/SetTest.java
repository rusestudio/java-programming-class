package _15장;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		
        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Egg");
        set.add("Egg"); //hashset / set not print repeated item
        
        System.out.println(set);
        System.out.println(set.size());

	}

}
