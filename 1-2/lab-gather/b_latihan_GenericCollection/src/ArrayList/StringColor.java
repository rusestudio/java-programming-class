package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.create string arraylist and add elements
		ArrayList<String> listColor = new ArrayList<String>();
		listColor.add("red");
		listColor.add("blue");
		listColor.add("yellow");
		
		System.out.println(listColor);
		
		//2.user input into array
		Scanner input = new Scanner(System.in);
		String inputcolor;
        System.out.println("Enter a color to add:");
        inputcolor = input.next();       
        listColor.add(inputcolor);
		
		
		//3.iterate through array
		for(String color : listColor) {
			System.out.println(color);
		}
		
		//or
		
		for(int i = 0; i < listColor.size(); i++) {
			System.out.println(listColor.get(i));
		}
		
		//4.insert elemet at index position
		listColor.add(0, "black");
		listColor.add(4, "white");
		System.out.println(listColor);
		
		//5.retrieve element at specific index position
		listColor.get(1);
		System.out.println(listColor.get(1));
		String getwhite = listColor.get(4);
		System.out.println(getwhite);
		
		//6.update array element by the given element
		listColor.set(2,  "green");
		System.out.println(listColor);
		
		//7.remove the element from array
		listColor.remove(3);
		listColor.remove(1);
		System.out.println(listColor);
		
		//8.search for an element in array
		if(listColor.contains("green")) {
			System.out.println("Found green");
		} else {
			System.out.println("Not found green");
		}
		
		
		//9.sort array list		
		System.out.println("before:" + listColor);
		Collections.sort(listColor);
		System.out.println("after:" + listColor);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(28);
		num.add(67);
		num.add(12);
		num.add(9);
		
		System.out.println("before:" + num);
		Collections.sort(num);
		System.out.println("after:" + num);
		
		//10.copy one array into another
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(9);
		num2.add(5);
		num2.add(3);
		num2.add(8);
		
		System.out.println("before copy num:" + num);
		System.out.println("before copy num2:" + num2);
		Collections.copy(num,  num2);
		System.out.println("after copy num:" + num);
		System.out.println("after copy num2:" + num2);
		
		//11. shuffle elements in array
		System.out.println("num2:" + num2);
		Collections.shuffle(num2);
		System.out.println("after shuffle num2:" + num2);
		
		//12. reverse elements in array
		System.out.println("before reverse num2:" + num2);
		Collections.reverse(num2);
		System.out.println("after reverse num2:" + num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
