package chapter8.ex02;

public class Car {
	
	String carName;
	String carColor;
	int maxSpeed;
	public Car() {
	}
	public Car(String carName, String carColor, int maxSpeed) {
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println(carName);
		System.out.println(carColor);
		System.out.println(maxSpeed);
	}
	
}
