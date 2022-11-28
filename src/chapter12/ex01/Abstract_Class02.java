package chapter12.ex01;

/*
 * 
 * 추상 메소드를 구현하는 방법 2가지
 * 1.자식클래스에서 구현한 클래스를 생성하고 출력 :  매번 자주 사용해야되는 경우 
 * 		출력코드가 간결하다 구현한 클래스를 생성해야 한다.
 * 
 * 2. 익명클래스를 생성해서 출력 : 한번 사용하고 버릴 경우, 안드로이드 개발할떄 , 이벤트 처리할때 사용
 * 			추상클래스의 구현한 자식 클래스 생성없이 바로 사용이 가능
 * 			여러번 사용할때는 구현한 코드를  매번 생성해야 된다 
 * 
 */
// 첫번째 방법 추상클래스(A) <== 구현한 클래스(B)
abstract class A {			//추상 클래스
	abstract void cry();
}

//구현 클래스를 생성: <<

class B extends A{  // 1. 자식 클래스에서 추상클래스의 메소드를 구현한 클래스를 생성 
	@Override
	void cry() {
		System.out.println("모든 동물은 웁니다. (자식 클래스에서 추상 메소드를 완성)");
	}
}


// 두번째 방법 : 추상 클래스를 구현한 클래스 없이 바로 출력 
abstract class C {
	abstract void run();
}




public class Abstract_Class02 {

	public static void main(String[] args) {
		
		A a1 = new B();
		
		a1.cry();
		
		
		
		//추상클래스는 객체화 할수없다 타입으로 지정은 가능하다 
		
		////익명 클래스: 
		C c1 = new C() {
			
			//C: 추상 클래스의 구현되지 않는 메소드를 구현함
			//C 추상클래스의 오버라이딩해서 메소드를 구현
			@Override
			void run() {
				System.out.println("C 객체를 만들고 미완성 메소드를 완성해서 자식클래스 없이 완성 ");
			}
		};
		
		c1.run();
		
		C c2 = new C() {
			@Override
			void run() {
				System.out.println("미완성2 ==> 완성2");
			}
		};
		
		c2.run();
		
		
		
		
		
		
	}

}
