package chapter12.ex04;



//인터페이스에서 선언된 메소드를 구현하는 방법 2가지
/*
 *  1. 인터페이스에 선언된 메소드를 구현한 클래스를 생성후 출력
 *  2. 익명 클래스로 바로 출력 하는 방법
 *  
 */


interface A{
	void abc();
}

//1. A 인터페이스의 메소드를 구현하는 클래스 생성후 출력 
class Aa implements A{
	@Override
	public void abc() {
		System.out.println("객체 생성후 메소드 완성 : Aa");
	}
}



//2. 익명 클래스를 사용해서 출력 , 
interface B {
	void bcd();
}




public class Interface_Test {
	public static void main(String[] args) {
	
		
		/*
		 * 1. A인터페이스의 선언된 메소드를 구현한 클래스를 생성후 출력 : Aa
		 * 매번 자주 사용할경우 구현된 자식클래스를 생성후 출력
		 */
		A a1 = new Aa();
		a1.abc();
		A a2 = new Aa();
		a2.abc();
		A a3 = new Aa();
		a3.abc();
		
		
		

		B b1= new B() {
			@Override
			public void bcd() {
				System.out.println("B인터페이스의 구현된 메소드 bcd()");
			}
		};
		
		b1.bcd();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
