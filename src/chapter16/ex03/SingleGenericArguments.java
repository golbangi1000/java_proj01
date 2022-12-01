package chapter16.ex03;

class Apple{String apple = "애플";}
class Pencil{String pencil = "연필";}
class Banana{String banana = "바나나";}

//제너릭  클래스 : 다양한 타입을 저장할수있는 클래스
	// 클래스이름뒤 상관없음 
	// 객체를 생성할떄 <T> 들어있는 타입을 지정해서 객체를 생성함.
	// <T> 들어오는 타입은 객체형 타입만 들어와야 한다. 
	// wrapper class : 기본 자료형을 객체형 자료형으로 만든것
		// boolean : Boolean char : Char
		// byte : Byte, short : Short , int : Integer
class MyClass<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}



public class SingleGenericArguments {
	
	
	public static void main(String[] args) {
		//1. 제너릭 타입의 객체 생성하기
		MyClass<Apple> app1 = new MyClass<Apple>();
		System.out.println(app1);
		MyClass<Apple> app2 = new MyClass<Apple>();
		System.out.println(app2);
		
		//Apple 객체를 setter를 사용해서 주입하고 값 가져오기 
		app1.setT(new Apple());
		System.out.println(app1.getT().apple);
		
		
		
		//Pencil 객체를 setter를 사용해서 주입하고 값 가져오기 
		MyClass<Pencil> pen1 = new MyClass<Pencil>();
		pen1.setT(new Pencil());		//setter로 Pencil 객체를 주입
		System.out.println(pen1.getT().pencil); //getter로 Pencil 객체를 가져옴
		
		
		//Banana 객체를 setter로 주입하고 값가져오기 
		// MyClass안에 초기화가 안되있으니깐 초기화를 해야됨 밑에는 MyClass를 초기화한거지 Banana를 초기화한게 아님 
		MyClass<Banana> ba1 = new MyClass<>();
		ba1.setT(new Banana());
		System.out.println(ba1.getT().banana);
		
		
		//String값을 넣고 출력 하기 
		MyClass<String> str1 = new MyClass<>();
		str1.setT("안녕하세요");
		System.out.println(str1.getT());
		
		
		//int 값을 넣고 출력 하기 
		MyClass<Integer> int1 = new MyClass<>();
		int1.setT(134);
		System.out.println(int1.getT());
		
		
		//double값을 넣고 출력 하기 : double 객체 
		MyClass<Double> double1 = new MyClass<>();
		double1.setT(134.2);
		System.out.println(int1.getT());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
