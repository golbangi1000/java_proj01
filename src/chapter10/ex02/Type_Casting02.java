package chapter10.ex02;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}




public class Type_Casting02 {
	public static void main(String[] args) {
		// ac : A , B, C, 를 모두 내포하고 있고 A 타입으로 정의 <<A 접근>>
		A ac = new C();
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D);
		
		
		// bc : A,B,C를 모두 내포하고 있고 B타입으로 정의 <<A,B 접근>>
		B bc = new C();
		
		System.out.println(bc instanceof A);
		System.out.println(bc instanceof B);
		System.out.println(bc instanceof C);
		System.out.println(bc instanceof D);
		
		
		//2. 다운 캐스팅 (수동으로 명시) : 캐스팅이 불가능해도 실행은 가능 대신 실행시 exception 뜸 
		//aa는 A만 내포하고있다
		A aa = new A();
		
		if(aa instanceof B) {
			B ba = (B) aa; //실행하면 오류발생	
		} else {
			System.out.println("aa는 B를 내포하고 있지 않아서 다운캐스팅이 불가 합니다");
		}
		
		
		B bd = new D();
		
		System.out.println(bd instanceof A);
		System.out.println(bd instanceof B);
		System.out.println(bd instanceof C);
		System.out.println(bd instanceof D);
		
		
		
		
		
		
		
	}
}
