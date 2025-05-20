package setget;

public class Movie {
	
	private String director;
	private String title;
	private int duration;
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director= director;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title= title;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration= duration;
	}
	
	public String getMovieDetails() {
		return "Title: " + title + ", Director: " + director + ", Duration: " + duration + " minutes";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obj 
		Movie m = new Movie();
		
		//set info
		m.setTitle("my life");
		m.setDirector("anna me");
		m.setDuration(146);
		
		System.out.println(m.getMovieDetails());
		

	}

}
