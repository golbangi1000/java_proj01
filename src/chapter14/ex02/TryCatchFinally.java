package chapter14.ex02;




public class TryCatchFinally {
	public static void main(String[] args) {
		/*
		 예외를 처리하는 방법
		 		1.자신이 직접 예외를 처리 : try catch finally를 사용해서 처리
		 		2. 예외를 전가 :thrwos , 메소드 뒤에 throws
		 
		 
		 throws : 예외를 발생시키는 키워드
		 
		 
		 */
	
	//1. try ~ catch 
	try {
		//try 블락에서 예외가 발생되면 catch 블락의 코드를 실행
		//try 블락에서 예외가 ㅂ라생되지 않으면 catch 블락은 실행되지 않는다.
		System.out.println(3/0);
	}catch (ArithmeticException e) {//try블락에서 ArithmeticException이 발생했을때 
		System.out.println("try블락에서 오류가 발생되었습니다");
	}
	//오류 발생해도 끝까지감 
	
	System.out.println("========================================");
	
	//2.try ~ catch ~ finally 
	//finally 블락은 무조건 실행이 된다 
	try{
		System.out.println(3/0);
	}catch (ArithmeticException e) {
		System.out.println("숫자 0으로는 나눌수가 없다");
	} finally {  
		System.out.println("finally 블락: 반드시 실행되는블락");
	}
	
	
	
	System.out.println("프로그램의 마지막 입니다");
	
	
	
	}
}







