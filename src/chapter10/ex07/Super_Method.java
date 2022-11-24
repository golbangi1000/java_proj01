package chapter10.ex07;



class A {
	A() {
		System.out.println("A생성자");
	}
	

}
class B extends A{
	B() {
		super(); // 컴파일러가 자동으로 추가해줌 
		System.out.println("B생성자");
	
	}
}

class C {
	C(int a){
		System.out.println("C 생성자");
	}
}


class D extends C{
	
	D(){
		super(3);
	}
	
}


public class Super_Method {
	public static void main(String[] args) {
		/*
		 * super Method : 부모클래스의 생성자 호출
		 * 
		 * 		-자식 클래스 생성자는 기본적으로 super(),부모 클래스의 기본 생성자 호출 
		 */
		
		//1. A객체
		A aa = new A();
		
		//2. B객체
		B bb = new B();
		
		
		//3. C객체
		C cc = new D();
		
		
		
		
				
				
				
				
				
	}
}
