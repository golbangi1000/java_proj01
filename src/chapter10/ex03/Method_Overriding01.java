package chapter10.ex03;

class A {
	//부모 클래스
	void print() {
		System.out.println("A 클래스의 print()");
	}
}

class B extends A {	//자식 클래스 

	//annotation이 안붙으면 override가 안됨 
	@Override
	void print() {
		
		System.out.println("B클래스의 print()");
	}
	
}



public class Method_Overriding01 {
	public static void main(String[] args) {
		/*
		 * Method OVerloading: 동일한 이름의 메소드를 시그니쳐에 따라서 다르게 식병
		 * Method Overriding : 부모 클래스의 메소드를 자식 크랠스에서 재정의 해서 사용하는것
		 * <인스턴스 메소드> 
		 * 
		 * 
		 */
		
		A aa = new A();// A클래스의 print
		aa.print();
		B bb = new B();// B클래스의 print
		bb.print();
		A ab =new B(); /// B클래스의 print
		// A의 print를 호출하지만 B의 print를 씀 
		ab.print();
		
		
		
		
	}
}
