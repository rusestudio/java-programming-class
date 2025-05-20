package egc;

import java.util.ArrayList;
import java.util.Random;

public class convertarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//arraylist > array
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			arraylist.add(rand.nextInt(10)); // 0~99까지 random number
		}
		
		System.out.println("ArrayList:" + arraylist);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
            arraylist.add(i);
            arr[i] = arraylist.get(i);
            System.out.print(arr[i]+ " ");
        }		

        //array > array list
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        
        for(int i =0; i < 5;  i++) {
        	newlist.add(arr[i]);
        	
        }      
        System.out.println("\nnew array list:" + newlist);

	}

}
