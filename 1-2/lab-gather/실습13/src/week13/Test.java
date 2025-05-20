package week13;

class Book {
	public String title;
	public String author;
	
	public Book( String title, String author) {
		this.title= title;
		this.author= author;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			if (this.title.equals(((Book)obj).title) && this.author.equals(((Book)obj).author)){
				return true;
			}
			else {
				return false;
			}
		}
		else
			return false;
	}

}

class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("Java Concurrency in Practice", "Brian Goetz");

        // Book 객체 비교
        System.out.println("book1.equals(book2): " + book1.equals(book2)); // true
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // false

    }
}