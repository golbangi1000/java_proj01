package chapter11.ex04;

abstract class Car {
	abstract void run();
	abstract void eat();
	
}


class Truck extends Car{
	@Override
	void eat() {
		System.out.println("트럭은 기름을 먹는다");
	}
	@Override
	void run() {
		System.out.println("트럭은 좀 달린다 ");
	}
}

class MyCar extends Car{
	@Override
	void eat() {
		System.out.println("자가용은 기름을 먹는다");
	}
	@Override
	void run() {
		System.out.println("자가용은 잘달린다");
	}
}


class Excavator extends Car{
	@Override
	void eat() {
		System.out.println("굴삭기는 기름을 먹는다");
	}
	@Override
	void run() {
		System.out.println("굴삭기는 좀 느리다");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		
		
		
		Car truck = new Truck();
		Car myCar = new MyCar();
		Car excavator = new Excavator();
		
		truck.eat();
		truck.run();
		myCar.eat();
		myCar.run();
		excavator.run();
		excavator.eat();
		
		
		
		
		
		
		
		
		
		
		
	}
}
