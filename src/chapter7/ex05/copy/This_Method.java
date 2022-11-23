package chapter7.ex05.copy;
class B {
	B(){
		System.out.println("기본생성자를 호출 했습니다");
	}
	
	B(int a){
		this(); //반드시 생성자 내부에 첫 라인에 와야 한다.
		System.out.println("매개변수가 하나인 생성자 입니다 ");
	}
	B(int a, int b){
		this(3);	// 매개변수가 1개인 생성자 호출
		System.out.println("배개면수가 정수 2개인 생성자");
	}
	
	B(int a, int b, int c){
		this(2,3); //매개변수가 2개인 생성자 호출
		System.out.println("매개변수 3개 생성자");
	}
}

public class This_Method {
	
	

	
	
	
	public static void main(String[] args) {
		/*
		 *  this(): this 메소드 : 자신의 객체의 다른 생성자를 호출할때 사용
		 *  반드시 생성자 첫 라인에 위치 해야 한다 
		 */
		B b1 = new B(); // can't init non static inner class
		B b2 = new B(12);
		B b3 = new B (1,2);

		
		
	}
	
	
	
	
}
