package midtermans;

import java.util.Arrays;
import java.util.Comparator;

public class PublicationTest {
    public static void main(String[] args) {
        Publication[] publications = new Publication[10];

        // Create objects of different types
        publications[0] = new Publication("Publisher1", 100, 9.99, "General Publication");
        publications[1] = new Magazine("Publisher2", 50, 5.99, "Monthly News", "Monthly");
        publications[2] = new Book("Publisher3", 300, 19.99, "Novel X", "Author A");
        publications[3] = new KidsMagazine("Publisher4", 30, 3.99, "Kids Fun", "Weekly", "5-10 years");
        publications[4] = new Publication("Publisher5", 150, 12.99, "Another Publication");
        publications[5] = new Magazine("Publisher6", 60, 6.99, "Tech Review", "Biweekly");
        publications[6] = new Book("Publisher7", 400, 24.99, "History Book", "Author B");
        publications[7] = new KidsMagazine("Publisher8", 40, 4.99, "Young Learners", "Monthly", "8-12 years");
        publications[8] = new Magazine("Publisher9", 70, 7.99, "Science Journal", "Quarterly");
        publications[9] = new Book("Publisher10", 250, 14.99, "Programming Guide", "Author C");

        // Sort publications in descending order based on title
        Arrays.sort(publications, new Comparator<Publication>() {
            @Override
            public int compare(Publication p1, Publication p2) {
                return p2.getTitle().compareTo(p1.getTitle());
            }
        });

        // Output information for each publication
        for (Publication pub : publications) {
            pub.output();
            System.out.println("------------------------");
        }
    }
}