package chapter7.ex05.copy;

public class This_Keyword {

	
	
	class A{
		//필드 Heap영역에 저장  <== 지역 변수 stack 저장
		int m;
		int n;
		
		void init(int a, int b,int m) {
			int c;
			c = 3;
			m = a; //this.m 인데 생략되어 있음 
			n = b;
			this.m = m;
		}
		
		
		
		void init(int a, int b) {
			int c;
			c= 3;
			m =a;
			n = b;
			
		}
		
		void work() {
			this.init(2, 3, 5);
			System.out.println(m + " " + n);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		/*
		 *  this : 자기 자신 객체의 필드나 메소드, <==필드, 메소드에 적용
		 *  this() : 자신객체의 다른 생성자 호출시 사용
		 *  super:	상속에서 부모의 객체의 필드나 메소드를 사용.
		 *  super() :	부모 클래스의 생성자 호출 할떄 사용 
		 */
		
		
		
	}

}
