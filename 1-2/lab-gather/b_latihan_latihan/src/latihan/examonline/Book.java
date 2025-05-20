package latihan.examonline;

public class Book {
	
	public String title;
	public String author;
	public String publisher;
	public String city;
	public String dateofp;
	public float price;
	public ISBN isbnNum; //object of class ISBN
	
    //contructor
	public Book (String title, String author, String publisher,
			String city, String dateofp, float price) {
		this.title=title;
		this.author= author;
		this.publisher= publisher;
		this.city= city;
		this.dateofp= dateofp;
		this.price= price;
		isbnNum = new ISBN();
	}
	
	//method to set book ISBN
	public void setBookISBN (int n1, int n2, int n3, int n4) {
		isbnNum.setISBN(n1,n2,n3,n4);
	}
	
	//method to get return author
	public String getAuthor() {
		return author;
	}
	
	//method to return book ISBN as string
	public String getBookISBN() {
		return isbnNum.getISBN();
	}
	
	//method print detail
	public void printDetails(){
		System.out.println("Book Title:" + title);
		System.out.println("Book Author:" + author);
		System.out.println("Publisher:" + publisher);
		System.out.println("ISBN:" + getBookISBN());
		
	}

}
