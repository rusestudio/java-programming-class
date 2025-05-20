package labw7;

public interface Delivery {
	
	public int MAX_DISTANCE= 20;
	public int MIN_DISTANCE= 0;
	
	
	public double calculateETA(double distance);
	
	public void startDelivery(double distance);
	
	public default double calculateFuel(double distance) {
		return 0;
	}
	
	public default double calculateCost(double distance) {
		return (distance * 5 + calculateFuel(distance) * 10) *100;
	}
	
	public static boolean isDistanceValid(double distance) {
		if(distance > MIN_DISTANCE && distance <MAX_DISTANCE) {
			return true;
		}else {
		return false;
	}
	}

}
