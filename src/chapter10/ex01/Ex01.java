package chapter10.ex01;

class Animal{	
	/*
	 *  Tiger Eagle Lion 을 생성
	 *  자식 클래스에서는 필드 1 메소드1 정의
	 *  LionChild클래스는 lion상속해서 필드 1 메소드 1
	 */
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다");
	}
}

class Tiger extends Animal{
	String tigerFood;
	
	void tigereEatWhat() {
		System.out.println("호랑이는 " + tigerFood + "를 먹는다");
	}
}

class Eagle extends Animal{
	String eagleFood;
	
	void eagleEatWhat() {
		System.out.println("독수리는 " + eagleFood + "를 먹는다");
	}
}

class Lion extends Animal{
	String lionFood;
	
	
	void lionEatWhat() {
		System.out.println("사자는 " + lionFood + "를 먹는다");
	}
}

class LionChild extends Lion{
	int childNumber;
	
	void childNum() {
		System.out.println("사자새끼 마릿수:" + childNumber );
	}
}




public class Ex01 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		
		tiger.age = 10;
		tiger.color = "빨강";
		tiger.name = "호랑이";
		
		tiger.eat();
		tiger.sleep();
		tiger.tigerFood = "고기";
		
		tiger.tigereEatWhat();
		Eagle eagle = new Eagle();
		
		eagle.eagleFood = "생선";
		eagle.eagleEatWhat();
		Lion lion = new Lion();
		lion.lionFood = "고기";
		lion.lionEatWhat();
		
		
		LionChild lionc = new LionChild();
		
		lionc.age = 100;
		lionc.lionFood = "고기";
		lionc.childNumber = 1401;
		lionc.lionEatWhat();
		
		lionc.childNum();
		
		
	}
}
