package oopprac;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OnlineOrder extends CustomerOrder {
	 private String deliveryAddress;
	    private String trackingNumber;

	    // Constructor to initialize the OnlineOrder object
	    public OnlineOrder(String orderId, String customer, LocalDate orderDate, String deliveryAddress, String trackingNumber) {
	        // Call the superclass constructor to initialize common attributes
	        super(orderId, customer, orderDate);
	        this.deliveryAddress = deliveryAddress;
	        this.trackingNumber = trackingNumber;
	    }

	    // Getter for delivery address
	    public String getDeliveryAddress() {
	        return deliveryAddress;
	    }

	    // Getter for tracking number
	    public String getTrackingNumber() {
	        return trackingNumber;
	    }

	    // Method to calculate delivery time based on the address (dummy logic for demonstration)
	    public int calculateDeliveryTime() {
	        // Dummy logic: Assuming delivery time is based on the length of the address string
	        return deliveryAddress.length() % 10 + 1; // Just a placeholder logic
	    }

	    // Method to update the tracking status (dummy logic for demonstration)
	    public void updateTrackingStatus(String newStatus) {
	        // Dummy logic: Print the updated tracking status
	        System.out.println("Tracking Number: " + trackingNumber + " - Status: " + newStatus);
	    }

	    // Override the displayOrderDetails method to include additional details
	    @Override
	    public void displayOrderDetails() {
	        // Call the superclass method to display common details
	        super.displayOrderDetails();
	        // Display additional details for online order
	        System.out.println("Delivery Address: " + deliveryAddress);
	        System.out.println("Tracking Number: " + trackingNumber);
	    }
}
