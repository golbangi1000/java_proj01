package chapter7.ex01.copy;

public class Ex01 {
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(num1(1, 3, 4));
		System.out.println(num2(12.3, 124.1, 412.4));
	
		Ex01 e = new Ex01();
		
		e.print("밥", 125, 124.3);
	}
	
	
	
	//정수값 3개를 인풋 받아 리턴하는 메소드 (static)
	
	public static int num1(int a, int b, int c) {
		int x = a + b + c;
		return x;
	}
	//실수 3개를 인풋 받아 리턴 하는 메소드 (static)
	public static double num2(double a , double b, double c) {
		double x = a + b + c;
		return x;
	}
	
	
	//문자열을 연결해서 출력 하는 메소드 (인스턴스 메소드 : static 을 사용하지 않는 메소드)
	//제품 이름 제품 수량  제품 가격

	public void print(String proName, int proCount, double proPrice) {
		String x = "제품이름:" + proName + " "+"제품수량:" + proCount + " " + "제품가격: " + proPrice;
		System.out.println(x);
	}
	
	
	
	
	
	
	
	
}
