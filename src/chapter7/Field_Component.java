package chapter7;


class A {	//  A 클래스: 객체를 생성하기위한 틀.
	
	//필드 : 
	int a;
	boolean b;
	double c;
	String d;
	
	
	void defaultValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class B {
	int m = 3;
	int n = 4;
	
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}
	
	void work2 (int i) {
		int j = 4;
		System.out.println(i + j);
	}
	
	
}




public class Field_Component {
	
	public static void main(String[] args) {
		// 클래스 내부 구성요소. 
		/*
		 *  필드	field
		 *  메소드 method
		 *  생성자 constructor
		 *  
		 */
		
		
		A a = new A();
		
		a.defaultValue();
		
		
		
		System.out.println("===============================================");
		
		B b = new B();
		
		b.work1();
		b.work2(912);
		
		
		
		
		
		
		
		
		
	}
}
