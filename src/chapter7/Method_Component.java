package chapter7;


class Method{
	
	//필드는 생략
	//생성자 생략
	
	void print() {
		System.out.println("아녕");
	}
	
	
	int data() {
		return 3;
	}
	
	double sum (int a, double b) {
		return a + b;
	}
	
	
}
public class Method_Component {

	
	
	public static void main(String[] args) {
		/*
		 * method()	{
		 * }
		 * 
		 * 앞에 리턴타입이 존재해야됨
		 * 호출시 작동 
		 * void 리턴타입이 존재하지 않을떄
		 * int : 정수값 
		 */
		
		Method m =  new Method();
		
		
		m.print();
	}
	
	

	
	
	
	
	

}
