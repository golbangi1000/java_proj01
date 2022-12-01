package chapter16.ex06;

class A{
							//모든 타입이 들어갈수있음
	 public <T> void method (T t) {
		 //제너릭 메소드 내부에서 사용가능한 메소드는 Object의 메소드만 사용가능하다.
		 //단, 제너릭에 들어오는 타입이 제한이 적용된 경우는 메소드를 사용할수 있다.
		 
//		 System.out.println(t.length); //length라는 메소드는 String 클래스에 있기도함

		 System.out.println(t.equals("안녕"));
	 }
}


public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		
		System.out.println("안녕하세요.반갑습니다".length());
		A a = new A();
		a.method("안녕");//<String>생략되있음
		a.<String>method("안녕");
		a.method("하세요");
	}
}
