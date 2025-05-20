package midtermans;

public class Magazine extends Publication {
    protected String publicationCycle;

    public Magazine() {}

    public Magazine(String publisher, int pages, double price, String title, String publicationCycle) {
        super(publisher, pages, price, title);
        this.publicationCycle = publicationCycle;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Publication Cycle: " + publicationCycle);
    }

    // Getter and Setter
    public String getPublicationCycle() { return publicationCycle; }
    public void setPublicationCycle(String publicationCycle) { this.publicationCycle = publicationCycle; }
}