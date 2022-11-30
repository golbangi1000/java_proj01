package chapter14.ex01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class Aa {
		//
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}



public class CheckedException {
	public static void main(String[] args) {
		//예외 (Exception)
		//1.일반 예외 (Checked Exception)-
		/*
		 * 컴파일 단계에서 체크 
		 */
		//2.실행 예외 (Unchecked Exception, Runtime Exception)
		
		
		/*
		 *  1.InterruptedException: interrupt가 발생했을때 예외처리 
		 */
		
//		Thread.sleep(1000); //쓰레드를 멈춘다
		
		//2.ClassNotFoundException: 클래스를 찾지 못했을때 발생하는 Exception
		
//		Class cls = Class.forName("java.lang.Object");
		
		//3. IOException : Input Output 에러시 발생되는 예외
		//객체의 참조 변수 선언
		InputStreamReader in = new InputStreamReader(System.in);
		//예외 발생
//		in.read();
		
		//4. FileNotFoundException : 파일을 찾을수 없을때 발생되는 예 외 
//		FileInputStream fis = new FileInputStream("test.txt");
		
		//5. CloneNotSupportedException : 객체를 클롤(복사) 할수없는 예외 발생 
		Aa a1 = new Aa();
		
//		A a2 = (A) a1.clone();//a1객체를 복사해서 a2객체로 생성
		
		
		//위에 있는것들은 다 일반 예외들 
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
