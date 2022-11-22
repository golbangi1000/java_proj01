package chapter9.ex03;


class C{
	int a= 10;					// 인스턴스 필드 : 객체화 해서 사용 가능
	static int b = 20;			// 정적 필드 : 객체화 하지 않고 사용 가능
								// 모든 C 객체에서 공유되는 변수 
	
	void print1() {
		System.out.println(a + " " + b);
	}
	
	static void print2() { //정적 메소드에는 정적 필드만 됨 
		//System.out.println(a + " " + b);  a는 static이 아님 
	}
}




public class Instance_VS_Static02 {
	public static void main(String[] args) {
		//1. 객체 생성
		C c1 = new C();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.b = 100;  //여기서 바꾸니깐 c2.b에서도 100으로 바뀜 static이니깐 
		c1.a = 100;
		System.out.println("============================");
		C c2 = new C();
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		
		c1.a = 888;
		c2.a = 999;
		c2.b = 111;
		System.out.println("==========================");
		
		
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c2.b);
	}
}











