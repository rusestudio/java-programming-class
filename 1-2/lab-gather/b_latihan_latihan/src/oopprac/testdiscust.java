package oopprac;

public class testdiscust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a regular customer
        Customer customer1 = new Customer("Talisha Dion", "talisha@example.com");
        customer1.addPurchase(200);
        customer1.addPurchase(300);
        System.out.println("Total expenditure for " + customer1.getName() + ": " + customer1.calculateTotalExpenditure());

        // Create a loyal customer with a discount rate
        LoyalCustomer loyalCustomer = new LoyalCustomer("Fulchard Sofya", "fulchard@example.com", 10); // 10% discount
        loyalCustomer.addPurchase(200);
        loyalCustomer.addPurchase(300);
        System.out.println("Total expenditure for " + loyalCustomer.getName() + " after discount: " + loyalCustomer.calculateTotalExpenditure());
    
	}

}
