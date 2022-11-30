package chapter14.ex06;



//1. 예외 발생할떄 각 메소드 내부에서 예외를 직접 처리함
class A{
	void abc() {
		bcd();
		
	}
	
	void bcd() {


		try {
			System.out.println(3/0);
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class B{
	void abc() {
		try {
			bcd();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	void bcd() throws Exception {
		System.out.println(3/0);
		int[] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
	}
}



public class Ex01 {
	public static void main(String[] args) {
		A a = new A();
		
		a.abc();
		
		B b = new B();
		
		b.abc();
	}
}
