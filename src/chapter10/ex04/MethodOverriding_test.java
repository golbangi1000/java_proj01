package chapter10.ex04;


class Animal{
	String name;
	int age;
	
	
	void cry() {
		System.out.println("Animal 클래스의 cry");
	}
	
	
}



class Tiger extends Animal{
	/*
	 * 자식 클래스의 생성자에는 기본적으로 super()가 생략되어있다 
	 * 
	 * 기본 생성자가 생략되어 있따 
	 */
	
	int tigerNo;
	
	void tigerMethod() {
		System.out.println("Tiger클래스의 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("어흥");
	}
	
	

	
}


class Eagle extends Animal{
	int eagleNo;
	void eagleMethod() {
		System.out.println("Eagle 클래스 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class TigerChild extends Tiger{
	int tigerChildNo;
	
	void tigerChildMethod() {
		System.out.println("TigerChild클래스 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("응애");
	}
	
}


public class MethodOverriding_test {
	public static void main(String[] args) {
		/*
		 * 
		 * 메소드 오버라이딩 : 상속 관게에서 부모클래스의 메소드를 자식 클래스에서 재정의 
		 * 
		 */
		
		
		
		
		
		Animal a1 = new Animal();
		
		
		a1.cry();
		
		a1.age = 10;
		a1.name = "말랑이";
		a1.cry();
		
		
		Tiger t1 = new Tiger();
		
		t1.age = 12;
		t1.tigerNo = 124;
		t1.tigerMethod();
		t1.cry();
		
		
		
		Animal a2 = new Tiger();
		 a2.name = "호랑이2";
		 a2.age = 10;
		 
		 Tiger t2 = (Tiger)a2;
		 
		 
		 
		
		
		
		
		if (a2 instanceof TigerChild) {
			TigerChild t3 = (TigerChild) a2;
		} else {
			System.out.println("a2에는 TigerChild를 내포하고 있지 않습니다");
		}
		
		Animal a4 = new TigerChild();
		a4.cry();// 응애
		
		
		
		
		
		
		Tiger t10 = (Tiger) a4;
		
		t10.cry();
		
		
		
		TigerChild tc10 = (TigerChild)t10;
		
		tc10.cry();
		
		
		Animal a20 = tc10;
		a20.cry();
		
		
		
		
		//배열에 객체를 저장하고 
		
		
		System.out.println("=============================================");
		Animal a29 = new Animal();
		Animal a30 = new Tiger();
		Animal a31 = new Eagle();
		Animal a32 = new TigerChild();
		
		
		
		Animal[] arr = new Animal[] {a29,a30,a31,a32};
		
		
		for( Animal k : arr) {
			k.cry();
		}
		
		
		
		System.out.println();
		
		for( int i = 0 ; i < arr.length;i++) {
			Animal aa = arr[i];
			aa.cry();
		}
		
		
		//객체 변수를 블락 밖에서 선언후 출력
		Animal aaa = null;
		
		
		for( int i = 0 ; i < arr.length; i++) {
			aaa= arr[i];
			aaa.cry();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
