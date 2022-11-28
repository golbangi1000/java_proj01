package chapter12.ex02;

interface A{
	//모든 필드는 : public static final 
		//static: 객체 생성 없이 호출이 가능 
	public static final int a =3;
	
	//모든 메소드는 : public abstract가 생략되어 있음 
	public abstract void abc();

}



//인터페이스의 구현되지 않는 메소드를 구현한 클래스 
class AA implements A{	//인터페이스를 구현한 클래스 
	
	
	@Override
	public void abc() {
		System.out.println("A인터페이스 구현한 메소드");
	}
}


interface B{
	//public static final 생략됨
	int a = 3;
	
	//public abstract 생략됨 : 모든 메소드는 선언부만 있고 구현부가 없어야 한다. (예외, default, static) 
	void abc();
}

class Bb implements B{
	@Override
	public void abc() {  //접근제어자가 하위 접근제어자면 오류가 생김 
		System.out.println("B 인터페이스 구현한 메소드");
	}
}


abstract class C {
	int m = 4;
	void bcd() {
		System.out.println("추상메소드 C클래스의 메소드");
	}
	
	
	abstract void abc();
}


class Cc extends C{
	@Override
	void abc() {
		System.out.println("Cc");
	}
}

public class Interface01 {
	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface): 내부와 외부를 연결시켜주는 접점 
		 * 		-객체 생성이 불가함. 타입으로 지정은 가능
		 * 		-모든 필드는 public static final이 생략됨
		 * 				: 값수정이 불가능함
		 * 		-모든 메소드는 public abstract가 생략됨(예외, default, static 메소드: 1.8버전)
		 * 			:모든 메소드는 선언부만 있어야한다. 구현부가 있으면 안됨
		 * 			: 예외 , default, static 메소드는 인터페이스에서 유일하게 구현부를 가지는 메소드 
		 * 		-하나의 클래스는 하나의 부모 클래스를 상속해야 한다. 자바는 다중 상속 불가. 
		 * 		-하나의 클래스는 여러개의 인터페이스를 다중 상속이 가능 
		 * 
		 * 
		 * 
		 * 
		 * 1. 인터페이스는 객체화 할수없다. 구현되지 않는 메소드가 있기 때문에 
		 */
		
		//A aaa = new A();
		
		
		
		// 2. 타입 지정은 가능하다 
		A a1 = new AA();
		
		a1.abc();
		B b1 = new Bb();
		b1.abc();
		
		
		System.out.println("====================================");
		
		
		//3. 인터페이스의 필드는 public static final이 생략됨
				//static : 객체생성없이 호출이 가능
				//final : 상수니깐 값을 수정할수없다 
		
		System.out.println(A.a);
		System.out.println(B.a);
		
		System.out.println("============추상 클래스 (C) ==================");
		
		//1. 추상 클래스 : 객체 생성 불가 
		//C c1 = new C();		//C :  추상 클래스 
		
		//2. 추상 클래스 : 구현한 클래스를 객체화해서 타입지정을 가능
		C c2  = new Cc();
		System.out.println(c2.m);
		c2.m = 92;
		System.out.println(c2.m);
		
		 
		c2.bcd();
		c2.abc(); 
		
		
		
		
	}
}
