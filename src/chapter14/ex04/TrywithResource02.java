package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResource02 {
	public static void main(String[] args) {
		/*
		 * Try with resource : jave 1.7
		 * 일반적인 try 구문 try {} catch ()	{}
		 * 
		 * 
		 * Try with Resource:
		 * try(객체선언[Resource]) {} catch(Exception e) {}
		 * 
		 * 자동으로 객체를 close()
		 * 자동으로 객체를 제거하기 위해서는 AutoClosable()인터페이스를 구현 클래스만이 자동으로 제거됨
		 */
		
		//1. 자동으로 객체를 제거하는 예제 
			//(Resource : 객체를 선언) <== 객체를 자동으로 close() 하게 된다 
		try (InputStreamReader ir1 = new InputStreamReader(System.in);){
			System.out.println("글자입력:");
			char input = (char) ir1.read();       //일반 예외가 발생 
			
			System.out.println("입력한 글자는 : " + input);
		}catch (IOException e) {
			System.out.println("IOException이 발생되었습니다");
		}
		/*
		 * finally 블락에 close() 메소드를 사용하지 않더라도 자동으로 close()가 됨  
		 */
		
		
		
	}
}
