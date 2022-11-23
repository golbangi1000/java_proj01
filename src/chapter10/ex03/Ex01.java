package chapter10.ex03;

class Fruit{		//Fruit의 메소드를 오버라이딩해서 출력. Apple Banana Orange
	
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다");
	}
}

class Apple extends Fruit{

	@Override
	void eat() {
		System.out.println("사과는 맛있다");
	}
	
}

class Banana extends Fruit{

	@Override
	void eat() {
		System.out.println("바나나는 맛있다");
	}
	
}

class Orange extends Fruit{

	@Override
	void eat() {
		System.out.println("오렌지도 맛있다 ");
	}
	
}





public class Ex01 {
	public static void main(String[] args) {
		
		
		Fruit[] arr1 = new Fruit[3];
		
		Fruit a1 = new Apple();
		Fruit a2 = new Banana();
		Fruit a3 = new Orange();
		
		arr1[0] = a1;
		arr1[1] = a2;
		arr1[2] = a3;

		for(Fruit k : arr1) {
			k.eat();
		}
		
		
		
	}
}
