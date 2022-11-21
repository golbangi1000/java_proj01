package chapter7;

class Car{
	
	
	String company;
	String car_Name;
	String color;
	int year;
	int speed;
	int max_speed;
	//생성자오버로딩	: 시그니쳐에 따라서 다른 생성자를 호출  
	
	
	Car ()	{
		
	}
	
	Car (String company, String car_name, String color)	{
		this.company = company;
		this.car_Name = car_name;
		this.color = color;
	}
	
	Car(String company, String car_name, String color, int year, int maxSpeed){
		this.company = company;
		this.car_Name = car_name;
		this.color = color;
		this.year = year;
		this.max_speed = maxSpeed;
	}
	
	
	void print() {
		System.out.println("회사명: " + company);
		System.out.println("차명: " + car_Name);
		System.out.println("차색깔: " + color);
		System.out.println("연식:" + year);
		System.out.println("최대 스피드: " + max_speed);
		
	}
}



public class Constructor01 {


	public static void main(String[] args) {
		
		
		//1. 기본 생성자로 객체 생성
		Car car1 = new Car();
		
		//2. 매개변수 
		
		Car car2 = new Car("회사","차이름","색깔");
		car2.print();
		
		Car car3 = new Car("현대ㅐ","그랜져","파란색",1245,124);
		
		car3.print();//필드에 저장된 값을 출력 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
