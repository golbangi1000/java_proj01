package chapter16.ex07;

//제너릭 클래스로 들어오는 타입을 제한을 할수있다. , extends키를 사용해서 제한


class A{}
class B extends A{}
class C extends B{}

		// T 에 들어오는 타입을 extends로 제한 B타입으로만 제한 B는 C의 부모이니깐 C타입도 가능 
class D <T extends B> { // T타입으로 들어오는 타입을 제한을 둘수있다. 
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGenericClass {

	public static void main(String[] args) {
		
		
//		D <A> d1 = new D<>(); 오류 발생됨 A 타입은 들어갈수없다 
		D <B> d2 = new D<>();	//T : B 타입은 들어감
		D <C> d3 = new D<>();	//T : C 타입은 들어감.
		
		
		D d4 = new D(); // == 타입이 생략됐는데 
		
		
		// setter를 사용해서 타입에 값 입력
		d2.setT(new B()); // d2는 B정의해서 객체를 생성, setter 주입시 B객타입의 객체를 주입 
		d3.setT(new C()); // d3는 C타입을 정의해서 생성 setter주인시 C타입의 객체를 주입
		
		//이건 오류가 나옴 
//		d3.setT(new B()); // d3는 C타입으로 정의되어있다
		//B를 객체화하면 A , B 를 내포하고 있고 C객체가 내포 되어 있지 않다 
		d2.setT(new C() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
