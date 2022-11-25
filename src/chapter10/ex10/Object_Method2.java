package chapter10.ex10;


class A {	// Object클래스의 equals()메소드는 stack의 참조주소를 비교하도록 되잇음 
	//equals()가 정의되어 있지 않는 클래스 
	String name;
	
	
	A(String name){
		this.name = name;
	}
}

class Bb {
	String name;
	Bb(String name){
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) { //Object 타입으로 업캐스팅해서 들어옴
		//모든 객체의 최상위 부모는 Object이니깐 Object타입으로 하고 
		// Bb타입이 들어와도 자동으로 업캐스팅되고 name을 꺼낼때는 다운캐스팅을해서 가져옴 
		if(this.name ==((Bb)obj).name){  //다운 캐스트 했으니깐 .name이 가능 
			return true;
		} else {
			return false;
		}
		
		
		
	
	}
}
class Cc {
	String name;
	Cc(String name){
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) { //Object 타입으로 업캐스팅해서 들어옴
		//모든 객체의 최상위 부모는 Object이니깐 Object타입으로 하고 
		// Bb타입이 들어와도 자동으로 업캐스팅되고 name을 꺼낼때는 다운캐스팅을해서 가져옴 
		if(this.name ==((Bb)obj).name){  //다운 캐스트 했으니깐 .name이 가능 
			return true;
		} else {
			return false;
		}
		
		
		
	
	}
}

public class Object_Method2 {
	public static void main(String[] args) {
		// 오브젝트 클래스의 equals()메소드 기본적으로 참조 주소를 비교함 
		// 객체의 Heap의 값을 비교하는 것이   아니라 Stack 메모리의 참조주소 값을 비교
		// String 클래스는 equals()메소드가 재정의 되어 있어서 Heap값을 비교하도록 설정이 되어있다 
		
		
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("==============================");
		
		
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		
		System.out.println(a1 == a2);//stack의 참조주소 비교 false
		System.out.println(a1.equals(a2)); // 참조주소 비교 false
		System.out.println("==========================");
		
		
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		

//		b2.name = "안녕2";
//		System.out.println(b2.name);
		System.out.println(b1 == b2);// 참조주소 비교
		System.out.println(b1.name.hashCode());
		System.out.println(b2.name.hashCode());
		System.out.println(b1.name == b2.name);
		System.out.println(b1.equals(b2));// Heap name필드의 값을 비교하도록 재정의 
		
	}
	
	
	
	
	
	
	
	
	
}
