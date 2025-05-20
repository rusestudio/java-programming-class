package midtermans;

public class Publication {
    protected String publisher;
    protected int pages;
    protected double price;
    protected String title;

    public Publication() {}

    public Publication(String publisher, int pages, double price, String title) {
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
        this.title = title;
    }

    public void output() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
    }

    // Getters and Setters
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}