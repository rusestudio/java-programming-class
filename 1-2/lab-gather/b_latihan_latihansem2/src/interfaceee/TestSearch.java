package interfaceee;

interface Searchable{
	boolean search(String keyword);
}

class Document implements Searchable{
	
	 // Declare a private instance variable to store the content of the document
    private String content;

    // Constructor for initializing the document's content
    public Document(String content) {
        this.content = content;
    }

	@Override
	public boolean search(String keyword) {
		// Check if the content contains the specified keyword
        return content.contains(keyword);
	}

	
	
}

class WebPage implements Searchable{
	
	 // Declare private instance variables to store the URL and HTML content
    private String url;
    private String htmlContent;

    // Constructor for initializing the URL and HTML content
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

	@Override
	public boolean search(String keyword) {
		// Check if the HTML content contains the specified keyword
        return htmlContent.contains(keyword);
	}

}

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create an instance of the Document class with a sample content
        Document document = new Document("This is a sample document.");

        // Search for a keyword in the document and store the result
        boolean documentContainsKeyword = document.search("sample");

        System.out.println("This is a sample document.");
        // Print whether the document contains the keyword
        System.out.println("Document contains keyword 'sample': " + documentContainsKeyword);

        // Create an instance of the WebPage class with a sample URL and HTML content
        WebPage webPage = new WebPage("https://www.w3resource.com", "This is a sample webpage.");

        // Search for a keyword in the webpage and store the result
        boolean webPageContainsKeyword = webPage.search("webpage");

        System.out.println("https://www.w3resource.com This is a sample webpage.");
        // Print whether the webpage contains the keyword
        System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
	}

}
