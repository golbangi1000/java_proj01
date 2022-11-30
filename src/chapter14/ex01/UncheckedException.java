package chapter14.ex01;


class A{
	
}

class B extends A{
	
}




public class UncheckedException {
	public static void main(String[] args) {
		//실행 예외 : 컴파일 ㄷ나계에서 체크하지 않는다. 실행시 예외가 발생됨
			//UncheckedException, RunTimeException
		
		//1. ArithmeticException : 정수를 0으로 나누었을떄 발생하는 Exception
			//모든 프로그램에서 숫자를 0으로 나누면 오류발생
//		System.out.println(3/0); //can't / by zero 
		
		//2. ClassCastException : 다운 캐스팅 타입이 존재하지 않는 경우 발생
		
		A a= new A(); //부모클래스를 객체화
		
//		B b = (B)a; // a 객체는 B 타입을 포함하지 않는다
		
		
		//3. ArrayIndexOutOfBoundException : 배열의 방번호를 넘어버렸을때
		int [] arr = new int[] {1,2,3};
		
//		System.out.println(arr[3]);
		
		//4.NumberFormatException : 문자타입의 값을 정수 실수 변환예외
//		int num = Integer.parseInt("10!");
//		double num2 = Double.parseDouble("10.22!");
//		System.out.println(num2);
		
		//5. NullPointException : 참조주소의값이 null인데 메소드를 호출하는 경우
		String str = null;
//		System.out.println(str.charAt(2));//주소값이 null이라 에러 
		
		
	}
}
