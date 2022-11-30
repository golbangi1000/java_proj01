package chapter14.ex03;

import java.text.NumberFormat;

public class Multi_Catch01 {
	public static void main(String[] args) {
		//여러 예외가 동시에 발생된 경우 처리
		
		//1. 두개의 Exception 을 각각의 try ~ catch 로 처리
		
		try {
			System.out.println(3/0);

		} catch (ArithmeticException e) {
			System.out.println("에러걸림");
		}
		
		try {
			int num = Integer.parseInt("10A");

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException에러");
		}
		
		//2. 하나의 try ~ catch 에서 한꺼번에 처리
		System.out.println("======================================");
		try {
			System.out.println(3/0);
			int num2 = Integer.parseInt("100A");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수없습니다");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가");
		} finally {
			System.out.println("프로그램 종료  ");
		}
		
		
		//3.g하나의 try~catch 에서 한번에 처리
		
		
		try {
			System.out.println(3/0);
			int num2 = Integer.parseInt("10A");
		}catch (ArithmeticException | NumberFormatException e2) {
			System.out.println("두개가 한꺼번에");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
