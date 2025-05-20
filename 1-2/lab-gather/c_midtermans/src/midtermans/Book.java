package midtermans;

public class Book extends Publication {
    protected String author;

    public Book() {}

    public Book(String publisher, int pages, double price, String title, String author) {
        super(publisher, pages, price, title);
        this.author = author;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Author: " + author);
    }

    // Getter and Setter
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}