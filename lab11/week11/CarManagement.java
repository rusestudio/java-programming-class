package week11;

import java.util.*;

public class CarManagement {

	private static class Car {
		private String brand;
		private String model;
		private int mileage; // 주행 거리 (km)
		private double fuelLevel; // 연료량 (리터)

		// 초기 주행 거리는 0km, 초기 연료량은 50리터로 초기화
		public Car(String brand, String model) {
			
		}
		
		// Getter 메소드: 브랜드 조회
		public String getBrand() {
			
		}
		// Getter 메소드: 모델 조회
		public String getModel() {
			
		}
		// Getter 메소드: 주행거리 조회
		public int getMileage() {
			
		}
		// Getter 메소드: 연료량 조회
		public double getFuelLevel() {
			
		}
		
		/**
		 * 주어진 거리만큼 주행하고, 주행 후 연료 소모 및 주행 결과를 출력하는 메소드입니다.
		 * 연료가 0 이하인 경우 "연료가 부족하여 주행할 수 없습니다." 출력
		 * 주행 거리가 0 이하인 경우 "유효하지 않은 주행 거리입니다." 출력
		 * 주행에 필요한 연료 소모량 계산 (1km당 0.1리터 소모)
		 * 주행 후 소모량 만큼의 연료량 감소 및 주행 거리 증가
		 * 주행 결과 출력
		 * 
		 * @param distance 주행할 거리 (km)
		 */
		
		public void drive(int distance) {
			
		}
		
		
		/**
		 * 자동차에 연료를 주유하는 메소드입니다.
		 * 주유량을 입력받아 연료량을 증가시키고, 주유 결과를 출력합니다.
		 * 주유량이 0 이하인 경우 "유효하지 않은 주유량입니다." 출력
		 * 
		 * @param amount 주유할 연료량 (리터)
		 */
		public void refuel(double amount) {
		    
		}

		/**
		 * 자동차를 정비하는 메소드입니다.
		 * 정비 수행 메시지를 출력하고 주행 거리를 초기화하고 정비 완료 메시지를 출력합니다.
		 */
		public void maintenance() {
		    
		}
		// 자동차 관리 시스템 메뉴 출력
		public void displayMenu() {
			System.out.println("===== 자동차 관리 시스템 메뉴 =====");
			System.out.println("1. 주행");
			System.out.println("2. 주유");
			System.out.println("3. 정비");
			System.out.println("4. 종료");
			System.out.println("=============================");
		}
	}

	/**
	 * 자동차 관리 시스템의 메인 메소드입니다.
	 * 프로그램 실행 시 자동차 관리 시스템 메뉴를 표시하고 사용자의 입력을 받아 처리합니다.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 자동차 생성
		Car myCar = new Car("Hyundai", "Sonata");

		boolean running = true;
		
		//1번을 누르면 주행, 2번은 주유, 3번은 정비 메소드 실행하고 4번을 누르면 종료, 그 외는 "잘못 입력했습니다" 출력
		while (running) {
			myCar.displayMenu();
			System.out.print("메뉴를 선택하세요: ");
			int choice = input.nextInt();

			
		}

	}
}
