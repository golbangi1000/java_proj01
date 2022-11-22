package chapter9.ex03;


class A{
	int a= 1;
	int b = 2;
	
	void print() {
		System.out.println(a + " " + b);
	}
}

class B {
	static int a = 3;  // static 
	static int b = 4;
	
	static void print() { //static
		System.out.println(a + " " + b);
	}
}

public class Instance_VS_Static {
	public static void main(String[] args) {
		/*
		 *  A 클래스는 인스턴스 필드 인스턴스 메소드 
		 *  
		 *  B클래스는 static 메소드 필드
		 */
		System.out.println(B.a);
	}
}








