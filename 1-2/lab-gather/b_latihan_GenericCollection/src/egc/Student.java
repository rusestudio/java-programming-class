package egc;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//create list of student name
		ArrayList<String> name = new ArrayList<String>();
		
		//create menu
		boolean flag = true;
		
		while(flag) {
			System.out.println();
			System.out.println("----menu----");
			System.out.println("1. add");
			System.out.println("2. remove");
			System.out.println("3. search");
			System.out.println("4. display all");
			System.out.println("0. exit");
			System.out.println("----menu----");
			System.out.print("Enter menu choice:");
			int menu = input.nextInt();
			//check menu only 1,2,3,4,0
			if(menu !=1 || menu !=2 || menu !=3 || menu !=4 ||menu !=0) {
				System.out.println("invalid menu choice. please enter 1, 2, 3, 4, or 0");
                break;
			}
				
			System.out.println();
			
			switch(menu) {
			    case 1: //add student name into list
			    	System.out.println("enter student name:");
			    	String studentname = input.next();
			    	name.add(studentname);
			    	break;
			   
			    case 2: //remove
			    	System.out.println("enter student name to remove:");
			    	String studentnameRemove = input.next();
			    	
			    	if (name.contains(studentnameRemove)) {
			    		name.remove(studentnameRemove);
			    	    System.out.println("removed:" + studentnameRemove);
			    	    System.out.println("latest list:" + name);
			    	}else {
                    	System.out.println("failed to remove");
			    	}break;
			    	
			    case 3: //searc
			    	System.out.println("enter student name to search: ");
			    	String studentnameSearch = input.next();
			    	
			    	
			    	int index = name.indexOf(studentnameSearch); //get index in list
			    	if(name.contains(studentnameSearch)) {
			    		System.out.println("Found student: " + studentnameSearch + " at number: " + index);			    		
			    	}else {
			    		System.out.println("failed to search");
			    	}
			    	break;
			    	
			    case 4: //display
			    	
			    	if(name.size()> 0) {
			    		for(int i = 0; i < name.size(); i++) {
			    			System.out.println("Display name list: "+ name.get(i));
			    		}
			    		
			    	}else {
			    		System.out.println("list is empty");
			    	}
			    	break;	
			    	
			    case 0:
			    	flag = false;
			    	break;
			    	default:break;
			}
		}
		
	}

}
