package chapter10.ex05;


class A{
	int m = 3;

}


class B extends A{
	int m =4;
	
}

public class Override_instanceField {
	public static void main(String[] args) {
		// 메소드 오버라이딩
		/*
		 *  인스턴스 메소드 오버라이딩 
		 *  	--인스턴스 필드 : 오버라이딩 안됨   Heap공간에 값이 저장됨
		 *  	--정적 필드	: 오버라이딩 안됨	class 영역에 값이 저장됨 
		 *  	--인스턴스 메소드 : 오버라이딩 됨
		 *  	-- 정적 메소드	: 오버라이딩 안됨 
		 */
		
		A aa=  new A();
		B bb = new B();
		A ab = new B();
		
		
		System.out.println(aa.m);// 3
		System.out.println(bb.m);//4 
		System.out.println(ab.m); //3   오버라이딩이 안되서 3이 나옴 
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
