package 실습12;

public class Zoo2 {
	
	//parent class
	public static class Animal {    
        public String name;

        //decalre
        public Animal(String name) {
            this.name= name;
        }
        //complete
        public void makeSound() {
        	System.out.println(name+" 소리 냅니다.");
        }

    }

	//child class
    public static class Lion extends Animal {

        public Lion(String name) {
            super(name);
        }
        
        @Override
        public void makeSound() {
        	System.out.println(name+ " 으르렁 거립니다.");
        }

        
    }
    //child class
    public static class Elephant extends Animal {

        public Elephant(String name) {
        	super(name);
           
        }
        
        @Override
        public void makeSound() {
        	System.out.println(name+ " 뿌우 합니다.");
        }
       
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal("동물");
        Lion lion = new Lion("사자");
        Elephant elephant = new Elephant("코끼리");

        genericAnimal.makeSound(); // "동물이 소리를 냅니다." 출력
        lion.makeSound();           // "사자가 으르렁 거립니다." 출력
        elephant.makeSound();       // "코끼리가 뿌우 뿌우 합니다." 출력
    }
}
