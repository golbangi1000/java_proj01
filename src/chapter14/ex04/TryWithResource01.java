package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource01 {
	public static void main(String[] args) {
		/*
		 * Try 구문에서 리소스 자동해제 객체를 사용후에 반드시 그 객체를 제거 해서 메모리를 최적화
		 * 객체를 사용후 finally블락에서 객체를 제거함
		 */
		System.out.println("문자를 입력하세요!>>");
		
		//1.리소스 수동해제 : finally블락에서 객체를 close()메소드를 호출해서 객체를 메모리에서 제거
		//콘솔을 사용해서 문자열을 입력 받도록 하는 클래스 : InputStreamReader
		InputStreamReader ir1 = null;
		
		//일반예외 (Catched Exception): 프로그램 작성시 컴파일 단계에서 
		ir1 = new InputStreamReader(System.in);
		try {
			char input = (char) ir1.read();
			System.out.println("입력한글:" + input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/*
			 * 일반적으로 객체를 사용후 finally 블락에서 객체를제거함
			 * 객체를 제거할때도 예외처리가 되어야 됨.
			 * 더 간략하게 하는버 있음 
			 */
			if(ir1 !=null) {
				try {
					ir1.close();
				} catch (IOException e) {
					System.out.println("객체 제거시 예외 발생됨");
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
