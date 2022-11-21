package chapter06.ex01;

//외부 클래스 : 객체를 생성하기 위한 설계도, 템플릿
class A{
	//필드 ,멤버 변수,
	int m = 3;
	int n = 7;
	double d = 10.5;
	
	
	//기본 생성자 : 생략될수있다 , 생성자도 하나의 메소드 
	A()	{
		//기본 생성자 : 인풋 매개 변수가 비어있는 생성자를 기본 생성자
	}
	
	
	//메소드 
	//리턴타입 메소드명 
	void print()	{
		System.out.println("print 메소드를 호출했습니다");
	}
	
}


public class Object02 {
	public static void main(String[] args) {
		
		int b = 10;
		
		
		
		
		// new : Heap 공간에 필드와 메소드를 저장 하라
		// A() : A 클래스의 생성자 호출 
		A ab = new A();
		System.out.println(ab.d);
		System.out.println(ab.m);
		ab.print();
		
		//하나의 클래스를 생성하면 클래스를 기준으로 여러개의 객체를 생성 할수있따. 
		A aa = new A(); //두번째 객체 생성 
		
		System.out.println(aa.m);
		
		aa.print();
		
		
		
	}
	
	
}
















