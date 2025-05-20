package labw7;

public class Walking implements Delivery{
	
	private double speed= 5;
	
    public double calculateETA(double distance) {
		return distance/speed;
    	
    }
	
	public void startDelivery(double distance) {
		//if valid - delivery method, eta time, delivery fee print
		if(Delivery.isDistanceValid(distance)==true) {
		System.out.println("걸어서 배달을 시작합니다.");
		System.out.printf("예상 시간: %.0f분\n",calculateETA(distance)*60);
		System.out.printf("배달 비용: %.0f원\n", calculateCost(distance));
		}else {
		//if not valid
		System.out.println("유효 거리가 아닙니다. 해당 거리는 배달할 수 없습니다.");
	    }
	}


}
