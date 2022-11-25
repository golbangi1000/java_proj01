package chapter11.ex04;



abstract class Animal{
	abstract void eat();
	abstract void run();
	abstract void cry();
	
}

class Cat extends Animal{ //콘크리트 클래스 : 추상 메소드를 모두 구현한 메소드
	
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
	}
	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다");
	}
	@Override
	void run() {
		System.out.println("고양이가 달린다");
	}
}

abstract class Dog extends Animal{  //추상클래스의 추상 메소드를 일분만 구현 한경우 : 추상 클래스 
	@Override
	void cry() {
		System.out.println("개는 멍멍");
	}
	@Override
	void eat() {
		System.out.println("개는 뼈다구를 먹는다.");
	}
}

class DogChild extends Dog{//콘크리트 클래스 

	@Override
	void run() { //부모 클래스에서 
		System.out.println("강아지는 깡충");
		
	}
	
}


public class Abstract_Method {
	public static void main(String[] args) {
		
		
		//추상 클래스는 객체를 생성하지 못한다. 타입으로 지정은 가능하다 
		// Animal, Dog는 추상 크랠스이므로 객체 생성이 안된다.
		
		
		//1. Animal 객체 생성
		
		
		//Animal a1 = new Animal();		//오류 발생: 추상클래스는 객체화 못한다 
		
		Animal a2 = new Cat();
		
		a2.cry();
		a2.eat();
		a2.run();
		
		
		Cat c2 = new Cat();
		
		
		c2.cry();
		c2.run();
		c2.eat();
		
		Animal a3 = new DogChild();
		a3.cry();
		a3.eat();
		a3.run();// DogChild 
		
		DogChild dh1 = new DogChild();
		dh1.cry();
		dh1.eat();
		dh1.run();
	}
}


























