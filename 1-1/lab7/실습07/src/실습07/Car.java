package 실습07;

import 실습07.MyCar;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar car = new MyCar();
		
		car.brand = "현대";
		car.model = "소나타";
		car.year= 2022;
		car.color= "검정";
		car.platenum = 1951;
		car.oil = "휘발유";
		
		System.out.println("차의 제조사는: "+ car.brand);
		System.out.println("차의 모델은: "+ car.model);
		System.out.println("차의 연도는: "+ car.year);
		System.out.println("차의 색은: "+ car.color);
		System.out.println("차의 차량번호는: "+ car.platenum);
		System.out.println("차의 연료 종류는: "+ car.oil);

	}

}
