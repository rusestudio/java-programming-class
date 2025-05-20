package latihan.examonline;

public class testbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Book object
        Book book = new Book("Object First with Java"
        		+ "", "David j. Barnes and Michael Kolling", "Prentice Hall", "Boston", "2018", 45.00f);
        
        // Set the ISBN for the book
        book.setBookISBN(0, 941831, 39, 6);
        
        // Print the details of the book
        book.printDetails();

	}

}
