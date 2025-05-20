package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PublicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner input = new Scanner(System.in);
		
		//create list
		
		 Publication[] object= new Publication();
		 object[0] = new Publication("Company1", 10,5000,"Cat book");
		 object[1] = new Publication("Company1", 10,5000,"Cat book");
		 object[2] = new Publication("Company1", 10,5000,"Cat book");
		 object[3] = new Publication("Company1", 10,5000,"Cat book");
		 object[4] = new Publication("Company1", 10,5000,"Cat book");
		 
		 // Sort the list based on age using lambda expression
		    publication_type.sort((s1, s2) -> s1.getTitles().compareTo(s2.getTitles()));
		    


		    // Print the sorted list
		    System.out.println("\nSorted list based on Titles:");
		    for (Publication publicationin: publication_type) {
		      System.out.println(Publication.getTitles() + " - " + Publication.getTitles() + " - " + 
		    Publication.getTitles());
		    }

		}
		 
		//input data
		 //System.out.println("enter publishers: ");
		// String publishers= input.nextLine();
		 
		 //System.out.println("enter pages: ");
		 //int pages= input.nextInt();
		 
		 //System.out.println("enter prices: ");
		 //int prices= input.nextInt();
		 
		// System.out.println("enter titles: ");
		 //String titles= input.nextLine();
		 
		 
		 
		
		 
		 
		 

	

}
