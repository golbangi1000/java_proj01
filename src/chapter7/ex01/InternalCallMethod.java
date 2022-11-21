package chapter7.ex01;

public class InternalCallMethod {
		
	//main : 메소드 <== static 
	public static void main(String[] args) {
		//클래스 내부에서 다른 메소드 호출 
		//main 메소드는 메소드 이름 앞에 public 다른 패키지에서 호출이 가능하다
		//static 모든 인스턴스의 객체가 공유 
		//static : 인스턴스화 하지 않고 사용 가능하다 객체를 생성하지 않고 사용 가능하다
		print();
		System.out.println(twice(1));
		
		
		//이렇게 인스턴스를 초기화 안해도 쓸수 있음 
		System.out.println(InternalCallMethod.sum(1, 3));
	}
	
	
	/*
	 * 메소드 이름앞에 static 키를 넣으면 객체 생성 없이 호출이 가능함. 
	 */
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k * 2;
	}

	public static double sum (int m , double n) {
		return m + n;
	}
	
	
	//static키 없이 메소드 생성 : 인스턴스 메소드 (객체화 해야 호출이 가능)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
