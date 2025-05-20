package anonymous;

interface Animal2 {
    public String cry(String sound);
}

public class animal {
	
	 public String sayHello(Animal2 animal, String sound) {
	        return animal.cry(sound);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 animal animalFarm = new animal();

	        Animal2 tiger = (sound) -> "Hi, Tiger " + sound;
	        System.out.println(animalFarm.sayHello(tiger, "ROARR"));

	}

}