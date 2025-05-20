package chp7two;

public class Car {
	
	private String model;
	public Car(String model) { this.model = model; }
	public boolean equals(Object obj) {
	if (obj instanceof Car)
	return model.equals(((Car) obj).model); // String의 equals() 호출
	else
	return false;
	

}}
