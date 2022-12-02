package chapter16.ex05;

//제너릭 메소드 : 일반 클래스 내에 제너릭 타입을 가지는 메소드
class GenericMethods{
	
	
	//제너릭 메소드 : 일반클래스 내부에 제너릭 타입의 메소드
	//제너릭 클래스안에 있는 메소드는 제너릭 메소드가 아님 
//	접근제어자<외부에서타입지정> 리턴타입 메소드명 (인풋 매개변수){}
	public <T> T method1 (T t) {
		return t;
	}
	
	
	//동일한 타입의 두값을 인풋 받아서 같으면 True 다르면 false를 리턴시켜줌
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3 (K k, V v) {
		System.out.println(k + " : " + v);
	}
	
}




public class GenericMethod {
	public static void main(String[] args) {
		//제너릭 메소드 사용하기 
		//일반 클래스의 객체 생성 
		GenericMethods gm = new GenericMethods();
		
		String str = gm.<String>method1("안녕");
		String str1 = gm.method1("하세요"); //뒤의 인풋값으로 타입을 유추할수있는경우 생략가능 
		
		
		gm.<String>method1("안녕");
		Integer int1 = gm.method1(3312);
		System.out.println(int1);
		
		System.out.println(gm.<Double>method1(100.11));
		System.out.println(gm.method1(200.22));
		System.out.println(gm.method1(1234));
		
		System.out.println("======================================");
		
		//2. method2 호출
		
		//리턴 타입은 일반 타입 
		boolean bool1 = gm.<Double>method2(2.2, 2.2);
		boolean bool2 = gm.method2(2.32, 2.2);
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println(gm.<String>method2("안녕", "안녕"));
		System.out.println(gm.method2("안녕", "하세요"));
		
		System.out.println("=========================================");
		
		gm.<String, Integer>method3("국어",80);
		gm.method3("영어", 231);
		
		
		System.out.println("======================================");
		gm.method3("아바타2", "롯데시네마");
		gm.method3(1231, 1231);
		gm.<Integer,Double>method3(1234,123.123);
		gm.<Integer,Integer>method3(123,123);
		gm.<Integer,Void>method3(123,null);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
