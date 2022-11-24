package chapter10.ex09;

class Car{
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	public Car() {
		super();
	}
	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}


public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 1. 기본생성자 인풋 생성자
		 * 2. getter setter
		 * 3. toString() 재정의
		 * 4. 생성자로 할당후 출력
		 * 5.setter로 필드 값 할당후 출력 
		 */
		
		
		
		Car car1 = new Car("벤츠", "파란색", 200, "s500");
		
		System.out.println(car1.toString());
		
		
		Car car2 = new Car();
		
		car2.setCarColor("흰색");
		car2.setCarModel("e300");
		car2.setCarName("붕붕카");
		car2.setMaxSpeed(400);
		
		System.out.println(car2.toString());
		
		
		
		
		
		
		
		
	}
}
