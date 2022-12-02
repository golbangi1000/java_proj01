package chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개정도 생성해서 ArrayList에 저장후 객체를 출력시 필드의 값을 출력 하도록 함.

//for enhanced for 컬렉션 객체 자체 

class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	public Car(String company, String carModel, String color, int maxSpeed) {
		super();
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	
	
	
}



public class Ex01 {
	public static void main(String[] args) {
		
		Car a1 = new Car("현대","제네시스","검은색",300);
		Car a2 = new Car("벤츠","s500","검은색",400);
		Car a3 = new Car("페라리","페라리","검은색",500);
		
		
		
		ArrayList<Car> c1 = new ArrayList<>();
		
		c1.add(a1);
		c1.add(a2);
		c1.add(a3);
		for(int i = 0 ;  i < c1.size();i++) {
			System.out.println(c1.get(i));
		}
		
		for(Car k : c1) {
			System.out.println(k);
		}
		
		
		System.out.println(c1);
		
		
		
		
		
		
		
		
	}
}
