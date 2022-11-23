package chapter7.ex04.copy;

class A {
	int m;
	//기본생성자 생략:


	

	
	void work() {
		System.out.println(m);  //기본값으로 0
	}
	
}




class B {
	
	int m;
	B(){
		
	}
	void work() {
		System.out.println(m);
	}
}

class C{
	int m;
	
	//기본 생성자 생략
	C(int m){		//생성자 : 인풋 값 1개를 받는 생성자 
		this.m = m;		//인풋 매개변수 ==> 실행블락의 변수 ==> 필드의 변수 이름이 모두 동일할경우
	}
	
	void work() {
		System.out.println(m);
	}
	
	
	
	
}




public class DafaultConstructor {

	/*
	 * 생성자 객체를 생성할때 호출
	 * 
	 * 기본 생성자는 생략 가능 : A() {} , 클래스 내부에 다른 생성자가 존재할떄 
	 */
	public static void main(String[] args) {
		A a = new A();
		
		C c = new C(1231);
		c.work();
	}
	
}




















