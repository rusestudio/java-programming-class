package oopprac;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class testorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a CustomerOrder object
        CustomerOrder order = new CustomerOrder("ORD023", "Asih Wanjiku", LocalDate.now());
        
        // Display the order details
        order.displayOrderDetails();
        System.out.println();

        // Create an OnlineOrder object
        OnlineOrder onlineOrder = new OnlineOrder("ORD034", "Kai Biserka", LocalDate.now(), "123 ABC Street, Springfield", "STR455");
        
        // Display the online order details
        onlineOrder.displayOrderDetails();
       
        // Calculate and display the delivery time
        int deliveryTime = onlineOrder.calculateDeliveryTime();
        System.out.println("Estimated Delivery Time: " + deliveryTime + " days");
       
        // Update and display the tracking status
        onlineOrder.updateTrackingStatus("In Transit");
    }
	

}
