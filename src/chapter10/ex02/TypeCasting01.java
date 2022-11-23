package chapter10.ex02;

class Animal{
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
}

class Tiger extends Animal{
	String tigerSound;
	void tigerEat() {
		System.out.println("호랑이는 고기를 먹습니다");
	}
}


class TigerChild extends Tiger{
	
	String tigerChildSound;
	void tigerChildEat() {
		System.out.println("새끼 호랑이는 젖을 먹습니다");
	}
}









public class TypeCasting01 {
	public static void main(String[] args) {
		
		
		
		/*
		 * Tiger의 부모클래스가 Animal이니깐 up casting 가능 
		 * Tiger를 Animal타입으로 생성 해본거 
		 */
		Animal a1 = new Tiger();
		
		//a1 은 Animal 타입의 필드와 메소드만 사용가능
		a1.name = "호랑이";
		a1.age = 10;
		
		
		//2. 다운 캐스팅 Animal 부모 타입 --> Tiger 자식 타입 수동으로 명시
		//	 a1 : Tiger필드 메소드 + animal 필드와 메소드도 포함
		
		Tiger t2 =  (Tiger) a1;
		t2.age = 6;
		t2.eat();
		
		
		t2.tigerSound = "어흥";
		System.out.println(t2.tigerSound);
		t2.tigerEat();
		
		
		System.out.println("=======================");
		
		Tiger t3 = new Tiger();
		
		
		//다운 캐스팅 : 실행시 오류 발생. t3에는 TigerChild는 내포하고 있지 않기 때문에 다운캐스팅 실행시 오류발생
		//TigerChild t4 = (TigerChild) t3;
		//실행해보면 오류 발생 
		System.out.println(t3 instanceof Animal); //true
		System.out.println(t3 instanceof Tiger); //true
		System.out.println(t3 instanceof TigerChild); //false
		// t3가 Animal
		
		//다운캐스팅 할때에는 반드시 instanceof를 사용해야 한다.
		if(t3 instanceof TigerChild) {
			TigerChild t4 = (TigerChild) t3;
		}
		
		
		
		// 1. 업캐스팅
		
		// TigerChild 오브젝트에 Animal 타입으로 업캐스팅
		Animal a3 = new TigerChild();
		System.out.println(a3 instanceof Animal);
		System.out.println(a3 instanceof Tiger);
		System.out.println(a3 instanceof TigerChild);

		
		a3.name = "호랑이4";
		a3.age = 7;
		a3.eat();
		
		Tiger t5 = null;
		//a3를 Tiger타입으로 다운 캐스팅
		if( a3 instanceof Tiger) {
			 t5 = (Tiger) a3;
		}
		
		t5.tigerSound = "어흥";
		t5.name = "호랑이";
		
		
		TigerChild t6 = (TigerChild) t3;
		t6.age = 2;
		
		
		Animal t7 = t6;
		Tiger t8 = t6;
		
		
	}
}















