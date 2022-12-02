package chapter16.ex08;


//제너릭 메소드의 타입 제한

class A {
	// Number : byte, double, float, int, long, and short
	//Number는 정수나 실수를 처리하는 것들 
	public <T extends Number> void method1(T t) {
		//Object 클래스의 메소드외의 Number의 메소드를 사용가능함
		System.out.println(t.intValue());
	}
}


//인터페이스 
interface MyInterface{
	void print(); //public abstract
}


class B {
	
	// T: MyInterface 하위의 구현클래스가 올수있다. 주의 : 타입을 제한할떄는 extends를 사용
				     //MyInterface를 상속하는 모든 클래스
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}


public class BoundedtypeOfGenericMethod {

	
	public static void main(String[] args) {
		A a1 = new A();
		a1.<Double>method1(10.11);
		a1.method1(125.5);
		a1.<Integer>method1(31);
	
//		a.<String> method1("안녕"); 
		
			B b = new B(); 
			b.<MyInterface> method1 (new MyInterface() {
				@Override
				public void print() {
					System.out.println("print() 구현됨 ");				
				}
				
			}); 
			
			
			//인풋되는 타입을 생략 
			b.method1 (new MyInterface() {
				@Override
				public void print() {
					System.out.println("print() 구현됨 2 ");				
				}
				
			});
	}
}


















