package midtestagainself;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Publication {
	
	String publisher;
	int page;
	int price;
	String title;
	
	//constructor
	public Publication(String publisher, int page, int price, String title) {
		this.publisher= publisher;
		this.page=page;
		this.price = price;
		this.title = title;
	}
	
	public  void printinfo() {
		System.out.println("Publisher: " + publisher);
		System.out.println("Page: " + page);
		System.out.println("Price: " + price);
		System.out.println("Title: " + title);
	}
	
	//getter setter
	public String getPublisher() { return publisher; }
	public int getPage() { return page; }
	public int getPrice() { return price; }
	public String getTitle() { return title; }
	
	public void setPublisher(String publisher) { this.publisher = publisher; }
	public void setPage(int page) { this.page = page; }
	public void setPrice(int price) { this.price = price; }
	public void setTitle(String title) { this.title = title; }
	
}

class Magazine extends Publication {
	
	int publishmonth;
	int publishweek;
	int publishbiweek;
	
	public Magazine(String publisher, int page, int price, String title, int publishmonth, int publishweek,int publishbiweek) {
		super(publisher, page, price, title);
        this.publishmonth = publishmonth;
        this.publishweek = publishweek;
        this.publishbiweek = publishbiweek;
	}
	
	public void printinfo() {
		super.printinfo();
        System.out.println("Publish Month: " + publishmonth);
        System.out.println("Publish Week: " + publishweek);
        System.out.println("Publish Bi-Week: " + publishbiweek);
	}
	
	//getter setter
	public int getPublishmonth() { return publishmonth; }
	public int getPublishweek() { return publishweek; }
	public int getPublishbiweek() { return publishbiweek; }
	
	public void setPublishmonth(int publishmonth) { this.publishmonth = publishmonth; }
	public void setPublishweek(int publishweek) { this.publishweek = publishweek; }
	public void setPublishbiweek(int publishbiweek) { this.publishbiweek = publishbiweek; }
	
}

class Book extends Publication {
	
	String author;
	
	public Book(String publisher, int page, int price, String title, String author) {
		super(publisher, page, price, title);
        this.author = author;
	}
	
	public void printinfo() {
        super.printinfo();
        System.out.println("Author: " + author);
    }
	
	//getter setter
	public String getAuthor() { return author; }
	
	public void setAuthor(String author) { this.author = author; }
	
}

class KidsMagazine extends Publication {
	
	int age;
	
	public KidsMagazine(String publisher, int page, int price, String title, int age) {
        super(publisher, page, price, title);
        this.age = age;
    }
	
	public void printinfo() {
        super.printinfo();
        System.out.println("Age: " + age);
    }
	
	//getter setter
	public int getAge() {return age;}
	
	public void setAge(int age) { this.age= age;}
	
}



public class PublicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//create array publication,magazine,book,kids
		Publication[] allPublications = new Publication[10];
		int index =0;
		
		//input data
		// Input data for Publication
        System.out.println("Enter data for 2 Publications (publisher, pages, price, title):");
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter publisher: ");
            String publisher = input.next();
            System.out.print("Enter pages: ");
            int pages = input.nextInt();
            System.out.print("Enter price: ");
            int price = input.nextInt();
            System.out.print("Enter title: ");
            String title = input.next();
            allPublications[index++] = new Publication(publisher, pages, price, title);
        }

        // Input data for Magazine
        System.out.println("Enter data for 3 Magazines (publisher, pages, price, title, publishMonth, publishWeek, publishBiWeek):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter publisher: ");
            String publisher = input.next();
            System.out.print("Enter pages: ");
            int pages = input.nextInt();
            System.out.print("Enter price: ");
            int price = input.nextInt();
            System.out.print("Enter title: ");
            String title = input.next();
            System.out.print("Enter publish month: ");
            int publishMonth = input.nextInt();
            System.out.print("Enter publish week: ");
            int publishWeek = input.nextInt();
            System.out.print("Enter publish bi-week: ");
            int publishBiWeek = input.nextInt();
            allPublications[index++] = new Magazine(publisher, pages, price, title, publishMonth, publishWeek, publishBiWeek);
        }

        // Input data for Book
        System.out.println("Enter data for 3 Books (publisher, pages, price, title, author):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter publisher: ");
            String publisher = input.next();
            System.out.print("Enter pages: ");
            int pages = input.nextInt();
            System.out.print("Enter price: ");
            int price = input.nextInt();
            System.out.print("Enter title: ");
            String title = input.next();
            System.out.print("Enter author: ");
            String author = input.next();
            allPublications[index++] = new Book(publisher, pages, price, title, author);
        }

        // Input data for KidsMagazine
        System.out.println("Enter data for 2 Kids Magazines (publisher, pages, price, title, age):");
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter publisher: ");
            String publisher = input.next();
            System.out.print("Enter pages: ");
            int pages = input.nextInt();
            System.out.print("Enter price: ");
            int price = input.nextInt();
            System.out.print("Enter title: ");
            String title = input.next();
            System.out.print("Enter recommended age: ");
            int age = input.nextInt();
            allPublications[index++] = new KidsMagazine(publisher, pages, price, title, age);
        }

        // Print all publications
        System.out.println("\nAll Publications:");
        for (Publication pub : allPublications) {
            pub.printinfo();
            System.out.println();
        }
		
		//sort data down based on title
        //Arrays.sort(allPublications, Comparator.comparing(Publication::getTitle));
        //or
        Arrays.sort(allPublications, new Comparator<Publication>() {
            @Override
            public int compare(Publication p1, Publication p2) {
                return p1.getTitle().compareTo(p2.getTitle());
            }
        });

     
        // Print sorted publications
        System.out.println("\nPublications sorted by title:");
        for (Publication pub : allPublications) {
            pub.printinfo();
            System.out.println();
        }

        input.close();

	}

}
