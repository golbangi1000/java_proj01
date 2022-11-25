package chapter10.ex10;
// java.lang 패키지는 import없이 사용가능 
class Aa extends Object{    // 원래는  extends Object가 생략되어있음 
	// Object 클래스의 모든 메소드를 상속받는다
	// 자식 클래스는 하나의 부모만 상속할수있따
	/*
	 * java는 다중상속이 불가함
	 * 인터페이스는 다중 implements가 가능하다.
	 */
	int m = 3;
	int n = 4;
	
	String name;

	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}
		
	
	
	//toString() :  object클래스의 메소드 
	//객체를 출력시 toStirng()메소드가 작동이 되고
	//객체 자체를 출력시 객체의 필드의 값을 출력하도록 재정의해서 사용
	
	
}








public class Inheritance_Object01 {
	
	
	
	public static void main(String[] args) {
		Aa a = new Aa();
		
		
		//객체 자체를 출력시 Object 클래스으 ㅣtoString()이 작동됨 
		System.out.println(a);
		System.out.println(a.toString());
		
		//String 클래스는 toString()가 재정의 되어져있다 
		String s1 = new String("안녕");
		String s2 = "안녕";
		System.out.println(s1);
		System.out.println(s2);
	}

}
















