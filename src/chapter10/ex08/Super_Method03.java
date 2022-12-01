package chapter10.ex08;


class A{
	A(){
		this(3);
		System.out.println("A 생성자 1");
	}

	public A(int i) {
		System.out.println("A 생성자 2");
	}
	public void aa() {
		System.out.println("faw");
	}
	
}


class B extends A{
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}

	public B(int i) {
			//super();
		System.out.println("B 생성자 2");
	}
	

	
}

class C extends A{
	C(){
		System.out.println("C 생성자 1");
	}
	@Override
	public void aa() {
		super.aa();
	}
}



public class Super_Method03 {
	public static void main(String[] args) {

		B bb1 = new B();
		
		System.out.println("=========================");
		
		
		B bb2 = new B(3);
		
		System.out.println("========================");
		C cc = new C();
		System.out.println("=====================");
		cc.aa();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
