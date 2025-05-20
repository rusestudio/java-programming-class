package arraycalc;

public class upgradearray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a 2D array of Person objects with 2 rows and 3 columns
        Person[][] people = new Person[2][3];

        // Initialize the elements of the array
        people[0][0] = new Person("Alice", 25);
        people[0][1] = new Person("Bob", 30);
        people[0][2] = new Person("Charlie", 35);

        people[1][0] = new Person("David", 40);
        people[1][1] = new Person("Eve", 45);
        people[1][2] = new Person("Frank", 50);

        // Access and print the elements of the array
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[i].length; j++) {
                System.out.println(people[i][j].getName() + " - " + people[i][j].getAge());
            }
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    
	}

}
