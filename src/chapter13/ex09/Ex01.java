package chapter13.ex09;

interface Car {
	void run();
	void stop();
	void start();
}

class CarPlay{
	void abc( Car c1) {
		c1.run();
		c1.start();
		c1.stop();
	}
}




public class Ex01 {
	public static void main(String[] args) {
		// 4번째 방법으로 출력, Car 클래스의 abc() , 메소드의 매개변수에 구현한 코드 만들어서 호출
		
		//메소드 호출하기 위한 객체 생성
		CarPlay c1 = new CarPlay();
		
		Car car = new Car() {
			
			@Override
			public void stop() {
				System.out.println("멈춤");
			}
			
			@Override
			public void start() {
				System.out.println("엔진스타트");
			}
			
			@Override
			public void run() {
				System.out.println("달리자");
			}
		};
		
		c1.abc(car);
		
		System.out.println("==============================================");
		// 메소드안에 객체생성
		c1.abc(new Car() {
			@Override
			public void run() {
				System.out.println("붕붕");
			}
			@Override
			public void start() {
				System.out.println("시작 부릉부릉");
			}
			@Override
			public void stop() {
				System.out.println("끼익 멈춤 ");
			}
			
		});
		
		
		
		
		
	}
}
