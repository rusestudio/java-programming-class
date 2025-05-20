package latihan.inherit;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000, "Manager", 5);
        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000, "Developer", "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000, "Python");

        System.out.println("Manager's Bonus: $" + manager.calculationBonus());
        System.out.println("Developer's Bonus: $" + developer.calculationBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculationBonus());
        System.out.println();
        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());
        System.out.println();
        manager.manageProject();
        developer.writeCode();
        programmer.debugCode();

	}

}
