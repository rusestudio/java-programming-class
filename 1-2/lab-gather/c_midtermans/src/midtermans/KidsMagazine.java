package midtermans;

public class KidsMagazine extends Magazine {
    protected String recommendedAgeRange;

    public KidsMagazine() {}

    public KidsMagazine(String publisher, int pages, double price, String title, String publicationCycle, String recommendedAgeRange) {
        super(publisher, pages, price, title, publicationCycle);
        this.recommendedAgeRange = recommendedAgeRange;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Recommended Age Range: " + recommendedAgeRange);
    }

    // Getter and Setter
    public String getRecommendedAgeRange() { return recommendedAgeRange; }
    public void setRecommendedAgeRange(String recommendedAgeRange) { this.recommendedAgeRange = recommendedAgeRange; }
}