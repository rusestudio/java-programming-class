package interfaceee;

interface Playable{
	public void play();
}

class Football implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		 System.out.println("Playing football");
	}
	
}

class Volleyball implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		  System.out.println("Playing volleyball");
	}
	
}

class Basketball implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing basketball");
	}
	
}


public class Testplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Playable football = new Football();
	        Playable volleyball = new Volleyball();
	        Playable basketball = new Basketball();

	        // Call the "play" method on each Playable object to play different sports
	        football.play();
	        volleyball.play();
	        basketball.play();
	}

}
