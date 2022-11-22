package chapter8.ex01;



class A{
	/*
	 * 다른 패키지에서 접근이 불가 같은 패키지 내에서만 접근 가능
	 * 다른 패키지가 할려면 별도의 파일로 클래스를 생성후 public
	 * 
	 */
	
	public int a;
	public int b;
	
	A(){
		a=1;
		b=2;
	}
	
	public void print() {
		System.out.println(a + " " + b);
	}
	
}

public class ExternalClass {
		public static void main(String[] args) {
			
		}
}
