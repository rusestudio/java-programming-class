package labw7;

public class Bicycle implements Delivery {
	
	private double speed=15;
	
	@Override
	public double calculateETA(double distance) {
		// TODO Auto-generated method stub
		return distance/ speed;
	}

	@Override
	public void startDelivery(double distance) {
		// TODO Auto-generated method stub
		if(Delivery.isDistanceValid(distance)==true) {
			System.out.println("자전거로 배달을 시작합니다.");
			System.out.printf("예상 시간: %.0f분\n",calculateETA(distance)*60);
			System.out.printf("배달 비용: %.0f원\n", calculateCost(distance));
			}else {
			//if not valid
			System.out.println("유효 거리가 아닙니다. 해당 거리는 배달할 수 없습니다.");
		    }
		
	}
}
