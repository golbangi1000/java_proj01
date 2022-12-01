package chapter14.ex06;
/*
 * 예외 처리 : 1. try catch : 내가 직접 처리 , 
 * 2. throws 예외를 전가
 * 예외를 무한히 전가하는 경우 : main메서드에서 예외가 발생 
 */

class Aaa{
	void abc() throws InterruptedException {
		bcd();
	}
	void bcd() throws InterruptedException {
		cde();
	}
	void cde() throws InterruptedException {
		Thread.sleep(1000);
	}
}
public class ThrowsException02 {
	public static void main(String[] args) {
		Aaa a1 = new Aaa();
		try {
			a1.abc(); //try and catch 안하면 예외 처리 안됐다고 에러뜸 
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}
}
