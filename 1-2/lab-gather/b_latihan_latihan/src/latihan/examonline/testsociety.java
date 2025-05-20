package latihan.examonline;

public class testsociety {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Society society = new Society("Community Society");

        society.addMember("Alice", "123 Main St");
        society.addMember("Bob", "456 Maple St");
        society.addSeniorMember("Charlie", "789 Oak St", 20);
        society.addSeniorMember("David", "101 Pine St", 15);

        society.printAllMembers();
        int totalFees = society.getFeeTotal();
        System.out.println("Total Fees Collected: " + totalFees);
	}

}
