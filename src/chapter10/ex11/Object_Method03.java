package chapter10.ex11;
import java.util.HashMap;


class A{
	String name;
	A(String name){
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	
}


class B {
	String name;
	B(String name){
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
	
	@Override		// hashcode()
	public int hashCode() {
		return name.hashCode();
	}
	
	
}




public class Object_Method03 {
	public static void main(String[] args) {
		
		//HashMap : key, value
		// Key는 중복된 데이터를 넣을수 없다 
		// equals(), hashCode() 이 둘을 재정의 해줘야 중복된 값을 못넣게 할수있다 
		HashMap <Integer,String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(2, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);

		// Integer : equals(), hashCode() 메소드가 재정의 되어 있기 때문에 
		// Map 자료 구조의 key로 사용 할수있다
		
		//자신이 만든 객체를 Map에 Key로 사용 할 수 있다.
		// equals() hashCode()를 재정의 해야 Map에 Key로 사용할수있다
		
		System.out.println("=========================");
		
		// A클래스는 equals() 재정의, hashCode()가 재정의가 안되있음 
		// Map의 Key로 사용할수 없다 
		HashMap <A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터2");
		
		
		System.out.println(hm2);
		
		System.out.println("=========================");
		/*
		 *  B 클래스 : equals(), hashCode() 재정의 
		 *  Map 자료 구조의 key로 사용 가능하다 
		 */
		HashMap <B,String> hm3 = new HashMap<>();
		
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		
		System.out.println(hm3);
		
		
		
		
	}
}














