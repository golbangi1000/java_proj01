package chapter10.ex06;


class A{
	int a;
	
	A(){
		
	}
	//부모 클래스의 생성자가 존재함
	A(int a ){
		this.a = a;
	}
	

}

class B extends A {
	/*
	 * 자식 클래스의 생성자에는 기본적으로 super()가 기본적으로 생략되어있고
	 * 자식 클래스는 생성자 첫 라인에 super();생략됨 
	 */
	B(){
		super();
	}//부모 클래스에 기본  생성자가 없으면  에러가 뜸 

}


public class Super_keyword01 {
	public static void main(String[] args) {
			/*
			 * this keyword
			 * this() method
			 * 
			 * super keyword
			 * super method 
			 * 
			 */
		
		
		
		
	}
}
